package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFlowMediaStreamsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var FlowArn: string
  
  /**
    * The media streams that you want to add to the flow.
    */
  var MediaStreams: listOfAddMediaStreamRequest
}
object AddFlowMediaStreamsRequest {
  
  inline def apply(FlowArn: string, MediaStreams: listOfAddMediaStreamRequest): AddFlowMediaStreamsRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], MediaStreams = MediaStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddFlowMediaStreamsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddFlowMediaStreamsRequest] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMediaStreams(value: listOfAddMediaStreamRequest): Self = StObject.set(x, "MediaStreams", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamsVarargs(value: AddMediaStreamRequest*): Self = StObject.set(x, "MediaStreams", js.Array(value*))
  }
}
