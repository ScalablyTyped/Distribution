package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsConfiguration extends StObject {
  
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.undefined
  
  /**
    * Lambda function ARN that allows a bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * HTTPS endpoint that allows a bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.undefined
}
object EventsConfiguration {
  
  inline def apply(): EventsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsConfiguration]
  }
  
  extension [Self <: EventsConfiguration](x: Self) {
    
    inline def setBotId(value: String): Self = StObject.set(x, "BotId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "BotId", js.undefined)
    
    inline def setLambdaFunctionArn(value: SensitiveString): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionArnUndefined: Self = StObject.set(x, "LambdaFunctionArn", js.undefined)
    
    inline def setOutboundEventsHTTPSEndpoint(value: SensitiveString): Self = StObject.set(x, "OutboundEventsHTTPSEndpoint", value.asInstanceOf[js.Any])
    
    inline def setOutboundEventsHTTPSEndpointUndefined: Self = StObject.set(x, "OutboundEventsHTTPSEndpoint", js.undefined)
  }
}
