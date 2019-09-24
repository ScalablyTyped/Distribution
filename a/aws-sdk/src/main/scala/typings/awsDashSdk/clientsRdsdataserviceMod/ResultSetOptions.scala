package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetOptions extends js.Object {
  /**
    * A value that indicates how a field of DECIMAL type is represented in the response. The value of STRING, the default, specifies that it is converted to a String value. The value of DOUBLE_OR_LONG specifies that it is converted to a Long value if its scale is 0, or to a Double value otherwise.  Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to String, especially when working with currency values. 
    */
  var decimalReturnType: js.UndefOr[DecimalReturnType] = js.undefined
}

object ResultSetOptions {
  @scala.inline
  def apply(decimalReturnType: DecimalReturnType = null): ResultSetOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalReturnType != null) __obj.updateDynamic("decimalReturnType")(decimalReturnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetOptions]
  }
}

