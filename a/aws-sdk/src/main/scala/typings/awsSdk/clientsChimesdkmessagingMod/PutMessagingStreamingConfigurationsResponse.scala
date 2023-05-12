package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMessagingStreamingConfigurationsResponse extends StObject {
  
  /**
    * The requested streaming configurations.
    */
  var StreamingConfigurations: js.UndefOr[StreamingConfigurationList] = js.undefined
}
object PutMessagingStreamingConfigurationsResponse {
  
  inline def apply(): PutMessagingStreamingConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutMessagingStreamingConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutMessagingStreamingConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setStreamingConfigurations(value: StreamingConfigurationList): Self = StObject.set(x, "StreamingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigurationsUndefined: Self = StObject.set(x, "StreamingConfigurations", js.undefined)
    
    inline def setStreamingConfigurationsVarargs(value: StreamingConfiguration*): Self = StObject.set(x, "StreamingConfigurations", js.Array(value*))
  }
}
