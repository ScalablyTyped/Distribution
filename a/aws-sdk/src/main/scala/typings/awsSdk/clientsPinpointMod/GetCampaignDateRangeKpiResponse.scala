package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignDateRangeKpiResponse extends StObject {
  
  var CampaignDateRangeKpiResponse: typings.awsSdk.clientsPinpointMod.CampaignDateRangeKpiResponse
}
object GetCampaignDateRangeKpiResponse {
  
  inline def apply(CampaignDateRangeKpiResponse: CampaignDateRangeKpiResponse): GetCampaignDateRangeKpiResponse = {
    val __obj = js.Dynamic.literal(CampaignDateRangeKpiResponse = CampaignDateRangeKpiResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignDateRangeKpiResponse]
  }
  
  extension [Self <: GetCampaignDateRangeKpiResponse](x: Self) {
    
    inline def setCampaignDateRangeKpiResponse(value: CampaignDateRangeKpiResponse): Self = StObject.set(x, "CampaignDateRangeKpiResponse", value.asInstanceOf[js.Any])
  }
}
