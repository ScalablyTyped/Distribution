package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  /**
    *  An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.   For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  /**
    *  A timestamp that indicates the last time a repository's secret token was modified. 
    */
  var lastModifiedSecret: js.UndefOr[Timestamp] = js.native
  /**
    *  The AWS CodeBuild endpoint where webhook events are sent.
    */
  var payloadUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The secret token of the associated repository.    A Bitbucket webhook does not support secret.  
    */
  var secret: js.UndefOr[NonEmptyString] = js.native
  /**
    * The URL to the webhook.
    */
  var url: js.UndefOr[NonEmptyString] = js.native
}

object Webhook {
  @scala.inline
  def apply(
    branchFilter: String = null,
    filterGroups: FilterGroups = null,
    lastModifiedSecret: Timestamp = null,
    payloadUrl: NonEmptyString = null,
    secret: NonEmptyString = null,
    url: NonEmptyString = null
  ): Webhook = {
    val __obj = js.Dynamic.literal()
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter.asInstanceOf[js.Any])
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups.asInstanceOf[js.Any])
    if (lastModifiedSecret != null) __obj.updateDynamic("lastModifiedSecret")(lastModifiedSecret.asInstanceOf[js.Any])
    if (payloadUrl != null) __obj.updateDynamic("payloadUrl")(payloadUrl.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

