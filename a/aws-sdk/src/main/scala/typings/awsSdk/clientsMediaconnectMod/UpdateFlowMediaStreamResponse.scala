package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowMediaStreamResponse extends StObject {
  
  /**
    * The ARN of the flow that is associated with the media stream that you updated.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The media stream that you updated.
    */
  var MediaStream: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.MediaStream] = js.undefined
}
object UpdateFlowMediaStreamResponse {
  
  inline def apply(): UpdateFlowMediaStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFlowMediaStreamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlowMediaStreamResponse] (val x: Self) extends AnyVal {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setMediaStream(value: MediaStream): Self = StObject.set(x, "MediaStream", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamUndefined: Self = StObject.set(x, "MediaStream", js.undefined)
  }
}
