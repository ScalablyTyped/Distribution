package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcmpTypeCode extends js.Object {
  /**
    * The ICMP code. A value of -1 means all codes for the specified ICMP type.
    */
  var Code: js.UndefOr[Integer] = js.undefined
  /**
    * The ICMP type. A value of -1 means all types.
    */
  var Type: js.UndefOr[Integer] = js.undefined
}

object IcmpTypeCode {
  @scala.inline
  def apply(Code: js.UndefOr[Integer] = js.undefined, Type: js.UndefOr[Integer] = js.undefined): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Code)) __obj.updateDynamic("Code")(Code)
    if (!js.isUndefined(Type)) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[IcmpTypeCode]
  }
}

