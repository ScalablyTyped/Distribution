package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWebhookInput extends js.Object {
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.   It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.undefined
  /**
    *  An array of arrays of WebhookFilter objects used to determine if a webhook event can trigger a build. A filter group must pcontain at least one EVENT WebhookFilter. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.undefined
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName
  /**
    *  A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you use Bitbucket for your repository, rotateSecret is ignored. 
    */
  var rotateSecret: js.UndefOr[Boolean] = js.undefined
}

object UpdateWebhookInput {
  @scala.inline
  def apply(
    projectName: ProjectName,
    branchFilter: String = null,
    filterGroups: FilterGroups = null,
    rotateSecret: js.UndefOr[Boolean] = js.undefined
  ): UpdateWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (branchFilter != null) __obj.updateDynamic("branchFilter")(branchFilter)
    if (filterGroups != null) __obj.updateDynamic("filterGroups")(filterGroups)
    if (!js.isUndefined(rotateSecret)) __obj.updateDynamic("rotateSecret")(rotateSecret)
    __obj.asInstanceOf[UpdateWebhookInput]
  }
}

