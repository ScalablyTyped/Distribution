package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsResponse extends StObject {
  
  /**
    *  A summary of information about each campaign. 
    */
  var campaignSummaries: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.campaignSummaries] = js.undefined
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
}
object ListCampaignsResponse {
  
  inline def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignSummaries(value: campaignSummaries): Self = StObject.set(x, "campaignSummaries", value.asInstanceOf[js.Any])
    
    inline def setCampaignSummariesUndefined: Self = StObject.set(x, "campaignSummaries", js.undefined)
    
    inline def setCampaignSummariesVarargs(value: CampaignSummary*): Self = StObject.set(x, "campaignSummaries", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
