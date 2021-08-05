package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersMerchant extends StObject {
  
  /**
    * Id of the merchant.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * User-visible name of the merchant. Required.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2OrdersMerchant {
  
  inline def apply(): GoogleActionsV2OrdersMerchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersMerchant]
  }
  
  extension [Self <: GoogleActionsV2OrdersMerchant](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
