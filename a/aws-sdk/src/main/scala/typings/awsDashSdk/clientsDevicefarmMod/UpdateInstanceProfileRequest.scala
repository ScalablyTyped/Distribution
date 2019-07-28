package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: AmazonResourceName
  /**
    * The updated description for your instance profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * An array of strings specifying the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined
  /**
    * The updated name for your instance profile.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The updated choice for whether you want to specify package cleanup. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.undefined
  /**
    * The updated choice for whether you want to reboot the device after use. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.undefined
}

object UpdateInstanceProfileRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    name: Name = null,
    packageCleanup: js.UndefOr[Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[Boolean] = js.undefined
  ): UpdateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup)
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse)
    __obj.asInstanceOf[UpdateInstanceProfileRequest]
  }
}

