package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConnectFlowRequest extends StObject {
  
  /**
    * The ARN of the MediaConnect Flow that you want to use as a source.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
}
object MediaConnectFlowRequest {
  
  inline def apply(): MediaConnectFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConnectFlowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaConnectFlowRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
  }
}
