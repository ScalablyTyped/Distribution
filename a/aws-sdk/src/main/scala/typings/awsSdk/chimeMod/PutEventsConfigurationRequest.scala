package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
  
  /**
    * Lambda function ARN that allows the bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.native
  
  /**
    * HTTPS endpoint that allows the bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.native
}
object PutEventsConfigurationRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): PutEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutEventsConfigurationRequestMutableBuilder[Self <: PutEventsConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotId(value: NonEmptyString): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArn(value: SensitiveString): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
    
    @scala.inline
    def setOutboundEventsHTTPSEndpoint(value: SensitiveString): Self = StObject.set(x, "OutboundEventsHTTPSEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundEventsHTTPSEndpointUndefined: Self = StObject.set(x, "OutboundEventsHTTPSEndpoint", js.undefined)
  }
}
