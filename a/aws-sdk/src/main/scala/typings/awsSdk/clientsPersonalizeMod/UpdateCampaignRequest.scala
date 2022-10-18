package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn
  
  /**
    * The configuration details of a campaign.
    */
  var campaignConfig: js.UndefOr[CampaignConfig] = js.undefined
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  
  /**
    * The ARN of a new solution version to deploy.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}
object UpdateCampaignRequest {
  
  inline def apply(campaignArn: Arn): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
  
  extension [Self <: UpdateCampaignRequest](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    inline def setCampaignConfig(value: CampaignConfig): Self = StObject.set(x, "campaignConfig", value.asInstanceOf[js.Any])
    
    inline def setCampaignConfigUndefined: Self = StObject.set(x, "campaignConfig", js.undefined)
    
    inline def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    inline def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
  }
}
