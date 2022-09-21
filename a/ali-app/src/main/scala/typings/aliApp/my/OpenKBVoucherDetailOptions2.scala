package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenKBVoucherDetailOptions2
  extends StObject
     with BaseOptions[Any, Any] {
  
  var partnerId: String
  
  // 商户编号（如果传入了passId则不需传入）
  var serialNumber: String
}
object OpenKBVoucherDetailOptions2 {
  
  inline def apply(partnerId: String, serialNumber: String): OpenKBVoucherDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenKBVoucherDetailOptions2]
  }
  
  extension [Self <: OpenKBVoucherDetailOptions2](x: Self) {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
