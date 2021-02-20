package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenMerchantTicketListOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var partnerId: String = js.native
}
object OpenMerchantTicketListOptions {
  
  @scala.inline
  def apply(partnerId: String): OpenMerchantTicketListOptions = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantTicketListOptions]
  }
  
  @scala.inline
  implicit class OpenMerchantTicketListOptionsMutableBuilder[Self <: OpenMerchantTicketListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
  }
}
