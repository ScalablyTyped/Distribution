package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewDetail extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the product.
    */
  var ProductARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  
  /**
    * The status of the product.    AVAILABLE - The product is ready for use.    CREATING - Product creation has started; the product is not ready for use.    FAILED - An action failed.  
    */
  var Status: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Status] = js.undefined
}
object ProductViewDetail {
  
  inline def apply(): ProductViewDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewDetail]
  }
  
  extension [Self <: ProductViewDetail](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setProductARN(value: ResourceARN): Self = StObject.set(x, "ProductARN", value.asInstanceOf[js.Any])
    
    inline def setProductARNUndefined: Self = StObject.set(x, "ProductARN", js.undefined)
    
    inline def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    inline def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
