package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomLineItemsOutput extends StObject {
  
  /**
    *  A list of FreeFormLineItemListElements received. 
    */
  var CustomLineItems: js.UndefOr[CustomLineItemList] = js.undefined
  
  /**
    *  The pagination token that's used on subsequent calls to get custom line items (FFLIs). 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCustomLineItemsOutput {
  
  inline def apply(): ListCustomLineItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomLineItemsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCustomLineItemsOutput] (val x: Self) extends AnyVal {
    
    inline def setCustomLineItems(value: CustomLineItemList): Self = StObject.set(x, "CustomLineItems", value.asInstanceOf[js.Any])
    
    inline def setCustomLineItemsUndefined: Self = StObject.set(x, "CustomLineItems", js.undefined)
    
    inline def setCustomLineItemsVarargs(value: CustomLineItemListElement*): Self = StObject.set(x, "CustomLineItems", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
