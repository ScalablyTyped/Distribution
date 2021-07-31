package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMerchantVoucherListOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var partnerId: String
}
object OpenMerchantVoucherListOptions {
  
  @scala.inline
  def apply(partnerId: String): OpenMerchantVoucherListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantVoucherListOptions]
  }
  
  @scala.inline
  implicit class OpenMerchantVoucherListOptionsMutableBuilder[Self <: OpenMerchantVoucherListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
  }
}
