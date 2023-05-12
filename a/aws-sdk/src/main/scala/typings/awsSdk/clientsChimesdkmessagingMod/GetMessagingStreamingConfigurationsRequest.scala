package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessagingStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the streaming configurations.
    */
  var AppInstanceArn: ChimeArn
}
object GetMessagingStreamingConfigurationsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): GetMessagingStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMessagingStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMessagingStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
