package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a campaign.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The time the campaign was created.
    */
  var creationTime: js.Date
  
  /**
    * The description of the campaign.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The last time the campaign was modified.
    */
  var lastModificationTime: js.Date
  
  /**
    * The name of a campaign.
    */
  var name: js.UndefOr[campaignName] = js.undefined
  
  /**
    * The ARN of the signal catalog associated with the campaign.
    */
  var signalCatalogArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The state of a campaign. The status can be one of the following:    CREATING - Amazon Web Services IoT FleetWise is processing your request to create the campaign.    WAITING_FOR_APPROVAL - After a campaign is created, it enters the WAITING_FOR_APPROVAL state. To allow Amazon Web Services IoT FleetWise to deploy the campaign to the target vehicle or fleet, use the API operation to approve the campaign.     RUNNING - The campaign is active.     SUSPENDED - The campaign is suspended. To resume the campaign, use the API operation.   
    */
  var status: js.UndefOr[CampaignStatus] = js.undefined
  
  /**
    * The ARN of a vehicle or fleet to which the campaign is deployed.
    */
  var targetArn: js.UndefOr[arn] = js.undefined
}
object CampaignSummary {
  
  inline def apply(creationTime: js.Date, lastModificationTime: js.Date): CampaignSummary = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignSummary]
  }
  
  extension [Self <: CampaignSummary](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: campaignName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArnUndefined: Self = StObject.set(x, "signalCatalogArn", js.undefined)
    
    inline def setStatus(value: CampaignStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetArn(value: arn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
