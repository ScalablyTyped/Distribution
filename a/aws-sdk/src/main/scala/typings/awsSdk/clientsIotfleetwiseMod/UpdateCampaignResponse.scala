package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the campaign. 
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The name of the updated campaign.
    */
  var name: js.UndefOr[campaignName] = js.undefined
  
  /**
    * The state of a campaign. The status can be one of:    CREATING - Amazon Web Services IoT FleetWise is processing your request to create the campaign.     WAITING_FOR_APPROVAL - After a campaign is created, it enters the WAITING_FOR_APPROVAL state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the API operation to approve the campaign.     RUNNING - The campaign is active.     SUSPENDED - The campaign is suspended. To resume the campaign, use the API operation.   
    */
  var status: js.UndefOr[CampaignStatus] = js.undefined
}
object UpdateCampaignResponse {
  
  inline def apply(): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCampaignResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: CampaignStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
