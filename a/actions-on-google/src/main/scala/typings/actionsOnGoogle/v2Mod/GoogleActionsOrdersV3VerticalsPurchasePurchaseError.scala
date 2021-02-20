package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseError extends StObject {
  
  /**
    * Available quantity now. Applicable in case of AVAILABILITY_CHANGED.
    */
  var availableQuantity: js.UndefOr[Double] = js.native
  
  /**
    * Additional error description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Entity Id that corresponds to the error. Example this can correspond to
    * LineItemId / ItemOptionId.
    */
  var entityId: js.UndefOr[String] = js.native
  
  /**
    * Required: This represents the granular reason why an order gets rejected by
    * the merchant.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType] = js.native
  
  /**
    * Relevant in case of PRICE_CHANGED / INCORRECT_PRICE error type.
    */
  var updatedPrice: js.UndefOr[GoogleActionsOrdersV3PriceAttribute] = js.native
}
object GoogleActionsOrdersV3VerticalsPurchasePurchaseError {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseError]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableQuantity(value: Double): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseErrorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdatedPrice(value: GoogleActionsOrdersV3PriceAttribute): Self = StObject.set(x, "updatedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedPriceUndefined: Self = StObject.set(x, "updatedPrice", js.undefined)
  }
}
