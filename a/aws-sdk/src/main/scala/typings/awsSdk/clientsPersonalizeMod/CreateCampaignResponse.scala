package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCampaignResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
}
object CreateCampaignResponse {
  
  inline def apply(): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCampaignResponse]
  }
  
  extension [Self <: CreateCampaignResponse](x: Self) {
    
    inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
    
    inline def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
  }
}
