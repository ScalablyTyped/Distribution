package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3OrderOptions extends StObject {
  
  /**
    * If true, delivery address is required for the associated order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The app can request user info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var userInfoOptions: js.UndefOr[GoogleActionsTransactionsV3UserInfoOptions] = js.undefined
}
object GoogleActionsTransactionsV3OrderOptions {
  
  inline def apply(): GoogleActionsTransactionsV3OrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3OrderOptions]
  }
  
  extension [Self <: GoogleActionsTransactionsV3OrderOptions](x: Self) {
    
    inline def setRequestDeliveryAddress(value: Boolean): Self = StObject.set(x, "requestDeliveryAddress", value.asInstanceOf[js.Any])
    
    inline def setRequestDeliveryAddressUndefined: Self = StObject.set(x, "requestDeliveryAddress", js.undefined)
    
    inline def setUserInfoOptions(value: GoogleActionsTransactionsV3UserInfoOptions): Self = StObject.set(x, "userInfoOptions", value.asInstanceOf[js.Any])
    
    inline def setUserInfoOptionsUndefined: Self = StObject.set(x, "userInfoOptions", js.undefined)
  }
}
