package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.undefined
  /**
    *  An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.   For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.undefined
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName
}

object CreateWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName, branchFilter: String = null, filterGroups: FilterGroups = null): CreateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter)
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups)
    __obj.asInstanceOf[CreateWebhookInput]
  }
}

