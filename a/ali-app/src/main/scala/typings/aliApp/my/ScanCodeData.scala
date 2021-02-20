package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeData extends StObject {
  
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
  implicit class ScanCodeDataMutableBuilder[Self <: ScanCodeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarCode(value: String): Self = StObject.set(x, "barCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQrCode(value: String): Self = StObject.set(x, "qrCode", value.asInstanceOf[js.Any])
  }
}
