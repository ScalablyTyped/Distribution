package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignRequest extends StObject {
  
  /**
    * The configuration details of a campaign.
    */
  var campaignConfig: js.UndefOr[CampaignConfig] = js.undefined
  
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  
  /**
    * A name for the new campaign. The campaign name must be unique within your account.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) of the solution version to deploy.
    */
  var solutionVersionArn: Arn
  
  /**
    * A list of tags to apply to the campaign.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateCampaignRequest {
  
  inline def apply(name: Name, solutionVersionArn: Arn): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignRequest]
  }
  
  extension [Self <: CreateCampaignRequest](x: Self) {
    
    inline def setCampaignConfig(value: CampaignConfig): Self = StObject.set(x, "campaignConfig", value.asInstanceOf[js.Any])
    
    inline def setCampaignConfigUndefined: Self = StObject.set(x, "campaignConfig", js.undefined)
    
    inline def setMinProvisionedTPS(value: TransactionsPerSecond): Self = StObject.set(x, "minProvisionedTPS", value.asInstanceOf[js.Any])
    
    inline def setMinProvisionedTPSUndefined: Self = StObject.set(x, "minProvisionedTPS", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
