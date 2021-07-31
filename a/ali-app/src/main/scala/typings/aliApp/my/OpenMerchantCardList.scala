package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMerchantCardList
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var partnerId: String
}
object OpenMerchantCardList {
  
  @scala.inline
  def apply(partnerId: String): OpenMerchantCardList = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantCardList]
  }
  
  @scala.inline
  implicit class OpenMerchantCardListMutableBuilder[Self <: OpenMerchantCardList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
  }
}
