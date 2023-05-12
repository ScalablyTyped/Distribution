package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPriceListsResponse extends StObject {
  
  /**
    * The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of price list references that match your request. 
    */
  var PriceLists: js.UndefOr[typings.awsSdk.clientsPricingMod.PriceLists] = js.undefined
}
object ListPriceListsResponse {
  
  inline def apply(): ListPriceListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPriceListsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPriceListsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPriceLists(value: PriceLists): Self = StObject.set(x, "PriceLists", value.asInstanceOf[js.Any])
    
    inline def setPriceListsUndefined: Self = StObject.set(x, "PriceLists", js.undefined)
    
    inline def setPriceListsVarargs(value: PriceList*): Self = StObject.set(x, "PriceLists", js.Array(value*))
  }
}
