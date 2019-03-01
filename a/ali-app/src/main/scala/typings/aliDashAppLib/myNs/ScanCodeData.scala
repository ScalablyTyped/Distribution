package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeData extends js.Object {
  /**
  		 * 扫描条形码时返回条形码数据
  		 */
  var barCode: java.lang.String
  /**
  		 * 扫描二维码时返回二维码数据
  		 */
  var code: java.lang.String
  /**
  		 * 所扫码的类型
  		 */
  var qrCode: java.lang.String
}

object ScanCodeData {
  @scala.inline
  def apply(barCode: java.lang.String, code: java.lang.String, qrCode: java.lang.String): ScanCodeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("barCode")(barCode)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("qrCode")(qrCode)
    __obj.asInstanceOf[ScanCodeData]
  }
}

