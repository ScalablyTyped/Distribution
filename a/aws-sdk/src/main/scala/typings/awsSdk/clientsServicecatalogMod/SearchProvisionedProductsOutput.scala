package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProvisionedProductsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.undefined
  
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.TotalResultsCount] = js.undefined
}
object SearchProvisionedProductsOutput {
  
  inline def apply(): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchProvisionedProductsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisionedProducts(value: ProvisionedProductAttributes): Self = StObject.set(x, "ProvisionedProducts", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductsUndefined: Self = StObject.set(x, "ProvisionedProducts", js.undefined)
    
    inline def setProvisionedProductsVarargs(value: ProvisionedProductAttribute*): Self = StObject.set(x, "ProvisionedProducts", js.Array(value*))
    
    inline def setTotalResultsCount(value: TotalResultsCount): Self = StObject.set(x, "TotalResultsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsCountUndefined: Self = StObject.set(x, "TotalResultsCount", js.undefined)
  }
}
