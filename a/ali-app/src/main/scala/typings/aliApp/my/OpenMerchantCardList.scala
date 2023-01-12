package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenMerchantCardList
  extends StObject
     with BaseOptions[Any, Any] {
  
  var partnerId: String
}
object OpenMerchantCardList {
  
  inline def apply(partnerId: String): OpenMerchantCardList = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMerchantCardList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenMerchantCardList] (val x: Self) extends AnyVal {
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
  }
}
