package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHsmRequest extends js.Object {
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HsmArn] = js.native
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HsmSerialNumber] = js.native
}

object DescribeHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn = null, HsmSerialNumber: HsmSerialNumber = null): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn.asInstanceOf[js.Any])
    if (HsmSerialNumber != null) __obj.updateDynamic("HsmSerialNumber")(HsmSerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHsmRequest]
  }
}

