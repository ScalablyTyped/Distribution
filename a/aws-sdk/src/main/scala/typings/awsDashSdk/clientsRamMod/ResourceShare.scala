package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShare extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  /**
    * The time when the resource share was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.undefined
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  /**
    * The tags for the resource share.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object ResourceShare {
  @scala.inline
  def apply(
    allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
    creationTime: DateTime = null,
    lastUpdatedTime: DateTime = null,
    name: String = null,
    owningAccountId: String = null,
    resourceShareArn: String = null,
    status: ResourceShareStatus = null,
    statusMessage: String = null,
    tags: TagList = null
  ): ResourceShare = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowExternalPrincipals)) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (owningAccountId != null) __obj.updateDynamic("owningAccountId")(owningAccountId)
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ResourceShare]
  }
}

