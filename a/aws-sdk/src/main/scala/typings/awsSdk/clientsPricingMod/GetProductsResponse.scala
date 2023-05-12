package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProductsResponse extends StObject {
  
  /**
    * The format version of the response. For example, aws_v1.
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of products that match your filters. The list contains both the product metadata and the price information.
    */
  var PriceList: js.UndefOr[PriceListJsonItems] = js.undefined
}
object GetProductsResponse {
  
  inline def apply(): GetProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProductsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProductsResponse] (val x: Self) extends AnyVal {
    
    inline def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPriceList(value: PriceListJsonItems): Self = StObject.set(x, "PriceList", value.asInstanceOf[js.Any])
    
    inline def setPriceListUndefined: Self = StObject.set(x, "PriceList", js.undefined)
    
    inline def setPriceListVarargs(value: PriceListJsonItem*): Self = StObject.set(x, "PriceList", js.Array(value*))
  }
}
