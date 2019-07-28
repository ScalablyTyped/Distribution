package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceProfileRequest extends js.Object {
  /**
    * The description of your instance profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * An array of strings specifying the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined
  /**
    * The name of your instance profile.
    */
  var name: Name
  /**
    * When set to true, Device Farm will remove app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true, Device Farm will reboot the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.undefined
}

object CreateInstanceProfileRequest {
  @scala.inline
  def apply(
    name: Name,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    packageCleanup: js.UndefOr[Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[Boolean] = js.undefined
  ): CreateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup)
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup)
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse)
    __obj.asInstanceOf[CreateInstanceProfileRequest]
  }
}

