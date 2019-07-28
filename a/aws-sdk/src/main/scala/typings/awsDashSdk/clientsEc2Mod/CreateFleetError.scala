package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFleetError extends js.Object {
  /**
    * The error code that indicates why the instance could not be launched. For more information about error codes, see Error Codes.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message that describes why the instance could not be launched. For more information about error messages, see ee Error Codes.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The launch templates and overrides that were used for launching the instances. Any parameters that you specify in the Overrides override the same parameters in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.undefined
  /**
    * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.undefined
}

object CreateFleetError {
  @scala.inline
  def apply(
    ErrorCode: String = null,
    ErrorMessage: String = null,
    LaunchTemplateAndOverrides: LaunchTemplateAndOverridesResponse = null,
    Lifecycle: InstanceLifecycle = null
  ): CreateFleetError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (LaunchTemplateAndOverrides != null) __obj.updateDynamic("LaunchTemplateAndOverrides")(LaunchTemplateAndOverrides)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetError]
  }
}

