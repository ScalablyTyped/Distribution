package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLaunchTemplateRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraint: Maximum 128 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The information for the launch template.
    */
  var LaunchTemplateData: RequestLaunchTemplateData
  /**
    * A name for the launch template.
    */
  var LaunchTemplateName: awsDashSdkLib.clientsEc2Mod.LaunchTemplateName
  /**
    * A description for the first version of the launch template.
    */
  var VersionDescription: js.UndefOr[VersionDescription] = js.undefined
}

object CreateLaunchTemplateRequest {
  @scala.inline
  def apply(
    LaunchTemplateData: RequestLaunchTemplateData,
    LaunchTemplateName: LaunchTemplateName,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    VersionDescription: VersionDescription = null
  ): CreateLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData, LaunchTemplateName = LaunchTemplateName)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription)
    __obj.asInstanceOf[CreateLaunchTemplateRequest]
  }
}

