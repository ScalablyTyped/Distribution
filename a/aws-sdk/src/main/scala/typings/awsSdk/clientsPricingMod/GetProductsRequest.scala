package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProductsRequest extends StObject {
  
  /**
    * The list of filters that limit the returned products. only products that match all filters are returned.
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsPricingMod.Filters] = js.undefined
  
  /**
    * The format version that you want the response to be in. Valid values are: aws_v1 
    */
  var FormatVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The pagination token that indicates the next set of results that you want to retrieve.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The code for the service whose products you want to retrieve. 
    */
  var ServiceCode: String
}
object GetProductsRequest {
  
  inline def apply(ServiceCode: String): GetProductsRequest = {
    val __obj = js.Dynamic.literal(ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProductsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetProductsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setFormatVersion(value: String): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceCode(value: String): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
  }
}
