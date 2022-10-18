package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.undefined
  
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[string] = js.undefined
}
object GetCampaignsRequest {
  
  inline def apply(ApplicationId: string): GetCampaignsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsRequest]
  }
  
  extension [Self <: GetCampaignsRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: string): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setToken(value: string): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
