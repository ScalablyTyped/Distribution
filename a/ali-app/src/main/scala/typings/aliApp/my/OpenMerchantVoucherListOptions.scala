package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMerchantVoucherListOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var partnerId: String
}
object OpenMerchantVoucherListOptions {
  
  inline def apply(partnerId: String): OpenMerchantVoucherListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantVoucherListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenMerchantVoucherListOptions] (val x: Self) extends AnyVal {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
  }
}
