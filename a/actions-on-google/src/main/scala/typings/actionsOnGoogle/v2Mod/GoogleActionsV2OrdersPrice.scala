package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersPrice extends StObject {
  
  /**
    * Monetary amount. Required.
    */
  var amount: js.UndefOr[GoogleTypeMoney] = js.native
  
  /**
    * Type of price. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersPriceType] = js.native
}
object GoogleActionsV2OrdersPrice {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPrice]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersPriceMutableBuilder[Self <: GoogleActionsV2OrdersPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: GoogleTypeMoney): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersPriceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
