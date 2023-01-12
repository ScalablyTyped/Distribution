package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowMediaStreamsResponse extends StObject {
  
  /**
    * The ARN of the flow that you added media streams to.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The media streams that you added to the flow.
    */
  var MediaStreams: js.UndefOr[listOfMediaStream] = js.undefined
}
object AddFlowMediaStreamsResponse {
  
  inline def apply(): AddFlowMediaStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFlowMediaStreamsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddFlowMediaStreamsResponse] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setMediaStreams(value: listOfMediaStream): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamsUndefined: Self = StObject.set(x, "MediaStreams", js.undefined)
    
    inline def setMediaStreamsVarargs(value: MediaStream*): Self = StObject.set(x, "MediaStreams", js.Array(value*))
  }
}
