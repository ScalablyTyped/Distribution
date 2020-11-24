package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeData extends js.Object {
  
  /**
    * 扫描条形码时返回条形码数据
    */
  var barCode: String = js.native
  
  /**
    * 扫描二维码时返回二维码数据
    */
  var code: String = js.native
  
  /**
    * 所扫码的类型
    */
  var qrCode: String = js.native
}
object ScanCodeData {
  
  @scala.inline
  def apply(barCode: String, code: String, qrCode: String): ScanCodeData = {
    val __obj = js.Dynamic.literal(barCode = barCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], qrCode = qrCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeData]
  }
  
  @scala.inline
  implicit class ScanCodeDataOps[Self <: ScanCodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarCode(value: String): Self = this.set("barCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQrCode(value: String): Self = this.set("qrCode", value.asInstanceOf[js.Any])
  }
}
