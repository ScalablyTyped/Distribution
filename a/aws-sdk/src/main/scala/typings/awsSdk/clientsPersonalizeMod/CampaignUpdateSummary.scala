package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignUpdateSummary extends StObject {
  
  var campaignConfig: js.UndefOr[CampaignConfig] = js.undefined
  
  /**
    * The date and time (in Unix time) that the campaign update was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If a campaign update fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the campaign update was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the deployed solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the campaign update. A campaign update can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object CampaignUpdateSummary {
  
  inline def apply(): CampaignUpdateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignUpdateSummary]
  }
  
  extension [Self <: CampaignUpdateSummary](x: Self) {
    
    inline def setCampaignConfig(value: CampaignConfig): Self = StObject.set(x, "campaignConfig", value.asInstanceOf[js.Any])
    
    inline def setCampaignConfigUndefined: Self = StObject.set(x, "campaignConfig", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    inline def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
