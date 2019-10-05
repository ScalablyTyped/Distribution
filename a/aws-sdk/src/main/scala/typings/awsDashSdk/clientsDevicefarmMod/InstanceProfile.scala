package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * The description of the instance profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * An array of strings specifying the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined
  /**
    * The name of the instance profile.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * When set to true, Device Farm will remove app packages after a test run. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true, Device Farm will reboot the instance after a test run. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.undefined
}

object InstanceProfile {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    name: Name = null,
    packageCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[scala.Boolean] = js.undefined
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup)
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse)
    __obj.asInstanceOf[InstanceProfile]
  }
}

