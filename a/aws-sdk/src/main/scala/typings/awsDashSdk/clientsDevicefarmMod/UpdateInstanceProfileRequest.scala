package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateInstanceProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The updated description for your instance profile.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run is over. The list of packages is only considered if you set packageCleanup to true.
    */
  var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.native
  /**
    * The updated name for your instance profile.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The updated choice for whether you want to specify package cleanup. The default value is false for private devices.
    */
  var packageCleanup: js.UndefOr[Boolean] = js.native
  /**
    * The updated choice for whether you want to reboot the device after use. The default value is true.
    */
  var rebootAfterUse: js.UndefOr[Boolean] = js.native
}

object UpdateInstanceProfileRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    description: Message = null,
    excludeAppPackagesFromCleanup: PackageIds = null,
    name: Name = null,
    packageCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    rebootAfterUse: js.UndefOr[scala.Boolean] = js.undefined
  ): UpdateInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (excludeAppPackagesFromCleanup != null) __obj.updateDynamic("excludeAppPackagesFromCleanup")(excludeAppPackagesFromCleanup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(packageCleanup)) __obj.updateDynamic("packageCleanup")(packageCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(rebootAfterUse)) __obj.updateDynamic("rebootAfterUse")(rebootAfterUse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceProfileRequest]
  }
}

