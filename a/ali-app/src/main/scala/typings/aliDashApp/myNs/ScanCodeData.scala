package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeData extends js.Object {
  /**
  		 * 扫描条形码时返回条形码数据
  		 */
  var barCode: String
  /**
  		 * 扫描二维码时返回二维码数据
  		 */
  var code: String
  /**
  		 * 所扫码的类型
  		 */
  var qrCode: String
}

object ScanCodeData {
  @scala.inline
  def apply(barCode: String, code: String, qrCode: String): ScanCodeData = {
    val __obj = js.Dynamic.literal(barCode = barCode, code = code, qrCode = qrCode)
  
    __obj.asInstanceOf[ScanCodeData]
  }
}

