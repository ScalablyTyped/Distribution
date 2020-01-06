package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateId] = js.native
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateName] = js.native
  /**
    * The version numbers of one or more launch template versions to delete.
    */
  var Versions: VersionStringList = js.native
}

object DeleteLaunchTemplateVersionsRequest {
  @scala.inline
  def apply(
    Versions: VersionStringList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchTemplateId: LaunchTemplateId = null,
    LaunchTemplateName: LaunchTemplateName = null
  ): DeleteLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal(Versions = Versions.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsRequest]
  }
}

