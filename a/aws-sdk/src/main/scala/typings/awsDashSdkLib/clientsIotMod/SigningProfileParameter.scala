package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningProfileParameter extends js.Object {
  /**
    * Certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The location of the code-signing certificate on your device.
    */
  var certificatePathOnDevice: js.UndefOr[CertificatePathOnDevice] = js.undefined
  /**
    * The hardware platform of your device.
    */
  var platform: js.UndefOr[Platform] = js.undefined
}

object SigningProfileParameter {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificatePathOnDevice: CertificatePathOnDevice = null,
    platform: Platform = null
  ): SigningProfileParameter = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificatePathOnDevice != null) __obj.updateDynamic("certificatePathOnDevice")(certificatePathOnDevice)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[SigningProfileParameter]
  }
}

