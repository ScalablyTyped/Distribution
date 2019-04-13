package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHsmRequest extends js.Object {
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[HsmArn] = js.undefined
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[HsmSerialNumber] = js.undefined
}

object DescribeHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn = null, HsmSerialNumber: HsmSerialNumber = null): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn)
    if (HsmSerialNumber != null) __obj.updateDynamic("HsmSerialNumber")(HsmSerialNumber)
    __obj.asInstanceOf[DescribeHsmRequest]
  }
}

