package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsResponse extends StObject {
  
  var campaignSummaryList: js.UndefOr[CampaignSummaryList] = js.undefined
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCampaignsResponse {
  
  inline def apply(): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCampaignsResponse] (val x: Self) extends AnyVal {
    
    inline def setCampaignSummaryList(value: CampaignSummaryList): Self = StObject.set(x, "campaignSummaryList", value.asInstanceOf[js.Any])
    
    inline def setCampaignSummaryListUndefined: Self = StObject.set(x, "campaignSummaryList", js.undefined)
    
    inline def setCampaignSummaryListVarargs(value: CampaignSummary*): Self = StObject.set(x, "campaignSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
