package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportInstanceRequest extends js.Object {
  /**
    * A description for the instance being imported.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The disk image.
    */
  var DiskImages: js.UndefOr[DiskImageList] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.undefined
  /**
    * The instance operating system.
    */
  var Platform: PlatformValues
}

object ImportInstanceRequest {
  @scala.inline
  def apply(
    Platform: PlatformValues,
    Description: String = null,
    DiskImages: DiskImageList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchSpecification: ImportInstanceLaunchSpecification = null
  ): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DiskImages != null) __obj.updateDynamic("DiskImages")(DiskImages)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LaunchSpecification != null) __obj.updateDynamic("LaunchSpecification")(LaunchSpecification)
    __obj.asInstanceOf[ImportInstanceRequest]
  }
}

