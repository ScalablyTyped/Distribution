package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsConfiguration extends StObject {
  
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  
  /**
    * Lambda function ARN that allows a bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.native
  
  /**
    * HTTPS endpoint that allows a bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.native
}
object EventsConfiguration {
  
  @scala.inline
  def apply(): EventsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsConfiguration]
  }
  
  @scala.inline
  implicit class EventsConfigurationMutableBuilder[Self <: EventsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotId(value: String): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotIdUndefined: Self = StObject.set(x, "BotId", js.undefined)
    
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
