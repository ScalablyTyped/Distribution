package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnabledProductsForImportResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
  
  /**
    * The list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.undefined
}
object ListEnabledProductsForImportResponse {
  
  inline def apply(): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnabledProductsForImportResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProductSubscriptions(value: ProductSubscriptionArnList): Self = StObject.set(x, "ProductSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setProductSubscriptionsUndefined: Self = StObject.set(x, "ProductSubscriptions", js.undefined)
    
    inline def setProductSubscriptionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ProductSubscriptions", js.Array(value*))
  }
}
