package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProductsResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    * A list of products, including details for each product.
    */
  var Products: ProductsList
}
object DescribeProductsResponse {
  
  inline def apply(Products: ProductsList): DescribeProductsResponse = {
    val __obj = js.Dynamic.literal(Products = Products.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductsResponse]
  }
  
  extension [Self <: DescribeProductsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProducts(value: ProductsList): Self = StObject.set(x, "Products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "Products", js.Array(value*))
  }
}
