package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeData extends StObject {
  
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
  
  inline def apply(barCode: String, code: String, qrCode: String): ScanCodeData = {
    val __obj = js.Dynamic.literal(barCode = barCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], qrCode = qrCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeData]
  }
  
  extension [Self <: ScanCodeData](x: Self) {
    
    inline def setBarCode(value: String): Self = StObject.set(x, "barCode", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setQrCode(value: String): Self = StObject.set(x, "qrCode", value.asInstanceOf[js.Any])
  }
}
