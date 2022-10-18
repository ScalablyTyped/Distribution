package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProductSubscriptionsResponse extends StObject {
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that describes the list product subscriptions operation.
    */
  var ProductUserSummaries: js.UndefOr[ProductUserSummaryList] = js.undefined
}
object ListProductSubscriptionsResponse {
  
  inline def apply(): ListProductSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductSubscriptionsResponse]
  }
  
  extension [Self <: ListProductSubscriptionsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProductUserSummaries(value: ProductUserSummaryList): Self = StObject.set(x, "ProductUserSummaries", value.asInstanceOf[js.Any])
    
    inline def setProductUserSummariesUndefined: Self = StObject.set(x, "ProductUserSummaries", js.undefined)
    
    inline def setProductUserSummariesVarargs(value: ProductUserSummary*): Self = StObject.set(x, "ProductUserSummaries", js.Array(value*))
  }
}
