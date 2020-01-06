package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceProfileRequest extends js.Object {
  /**
    * The description of your instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run. The list of packages is considered only if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  /**
    * The name of your instance profile.
    */
  var name: Name = js.native
  /**
    * When set to true, Device Farm removes app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, Device Farm reboots the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}

object CreateInstanceProfileRequest {
  @scala.inline
  def apply(
    name: Name,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    packageCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceProfileRequest]
  }
}

