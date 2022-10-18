package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignHook extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to customize a segment for a campaign.
    */
  var LambdaFunctionName: js.UndefOr[string] = js.undefined
  
  /**
    * The mode that Amazon Pinpoint uses to invoke the AWS Lambda function. Possible values are: FILTER - Invoke the function to customize the segment that's used by a campaign. DELIVERY - (Deprecated) Previously, invoked the function to send a campaign through a custom channel. This functionality is not supported anymore. To send a campaign through a custom channel, use the CustomDeliveryConfiguration and CampaignCustomMessage objects of the campaign.
    */
  var Mode: js.UndefOr[typings.awsSdk.clientsPinpointMod.Mode] = js.undefined
  
  /**
    *  The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function over HTTPS.
    */
  var WebUrl: js.UndefOr[string] = js.undefined
}
object CampaignHook {
  
  inline def apply(): CampaignHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignHook]
  }
  
  extension [Self <: CampaignHook](x: Self) {
    
    inline def setLambdaFunctionName(value: string): Self = StObject.set(x, "LambdaFunctionName", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionNameUndefined: Self = StObject.set(x, "LambdaFunctionName", js.undefined)
    
    inline def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setWebUrl(value: string): Self = StObject.set(x, "WebUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "WebUrl", js.undefined)
  }
}
