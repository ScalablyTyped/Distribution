package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyLaunchTemplateRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraint: Maximum 128 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The version number of the launch template to set as the default version.
    */
  var DefaultVersion: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.LaunchTemplateName] = js.undefined
}

object ModifyLaunchTemplateRequest {
  @scala.inline
  def apply(
    ClientToken: String = null,
    DefaultVersion: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null
  ): ModifyLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (DefaultVersion != null) __obj.updateDynamic("DefaultVersion")(DefaultVersion)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    __obj.asInstanceOf[ModifyLaunchTemplateRequest]
  }
}

