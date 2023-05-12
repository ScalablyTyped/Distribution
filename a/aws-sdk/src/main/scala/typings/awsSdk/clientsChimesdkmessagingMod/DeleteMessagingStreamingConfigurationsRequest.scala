package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessagingStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the streaming configurations being deleted.
    */
  var AppInstanceArn: ChimeArn
}
object DeleteMessagingStreamingConfigurationsRequest {
  
  inline def apply(AppInstanceArn: ChimeArn): DeleteMessagingStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessagingStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessagingStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
