package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMessagingStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the streaming configuration.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The streaming configurations.
    */
  var StreamingConfigurations: StreamingConfigurationList
}
object PutMessagingStreamingConfigurationsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn, StreamingConfigurations: StreamingConfigurationList): PutMessagingStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], StreamingConfigurations = StreamingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMessagingStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutMessagingStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurations(value: StreamingConfigurationList): Self = StObject.set(x, "StreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurationsVarargs(value: StreamingConfiguration*): Self = StObject.set(x, "StreamingConfigurations", js.Array(value*))
  }
}
