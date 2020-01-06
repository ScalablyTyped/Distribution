package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSoftwareUpdateJobResponse extends js.Object {
  /**
    * The IoT Job ARN corresponding to this update.
    */
  var IotJobArn: js.UndefOr[__string] = js.native
  /**
    * The IoT Job Id corresponding to this update.
    */
  var IotJobId: js.UndefOr[__string] = js.native
  /**
    * The software version installed on the device or devices after the update.
    */
  var PlatformSoftwareVersion: js.UndefOr[__string] = js.native
}

object CreateSoftwareUpdateJobResponse {
  @scala.inline
  def apply(IotJobArn: __string = null, IotJobId: __string = null, PlatformSoftwareVersion: __string = null): CreateSoftwareUpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (IotJobArn != null) __obj.updateDynamic("IotJobArn")(IotJobArn.asInstanceOf[js.Any])
    if (IotJobId != null) __obj.updateDynamic("IotJobId")(IotJobId.asInstanceOf[js.Any])
    if (PlatformSoftwareVersion != null) __obj.updateDynamic("PlatformSoftwareVersion")(PlatformSoftwareVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
  }
}

