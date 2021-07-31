package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenVoucherDetailOptions2
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var partnerId: String
  
  // 商户编号，以 2088 为开头（如果传入了passId则不需传入）
  var serialNumber: String
}
object OpenVoucherDetailOptions2 {
  
  @scala.inline
  def apply(partnerId: String, serialNumber: String): OpenVoucherDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenVoucherDetailOptions2]
  }
  
  @scala.inline
  implicit class OpenVoucherDetailOptions2MutableBuilder[Self <: OpenVoucherDetailOptions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
  }
}
