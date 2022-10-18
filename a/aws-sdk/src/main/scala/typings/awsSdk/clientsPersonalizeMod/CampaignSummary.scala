package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date and time (in Unix time) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object CampaignSummary {
  
  inline def apply(): CampaignSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSummary]
  }
  
  extension [Self <: CampaignSummary](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    inline def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
