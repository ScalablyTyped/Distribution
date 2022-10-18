package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFlowMediaStreamResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow.
    */
  var FlowArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the media stream that was removed.
    */
  var MediaStreamName: js.UndefOr[string] = js.undefined
}
object RemoveFlowMediaStreamResponse {
  
  inline def apply(): RemoveFlowMediaStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFlowMediaStreamResponse]
  }
  
  extension [Self <: RemoveFlowMediaStreamResponse](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "FlowArn", js.undefined)
    
    inline def setMediaStreamName(value: string): Self = StObject.set(x, "MediaStreamName", value.asInstanceOf[js.Any])
    
    inline def setMediaStreamNameUndefined: Self = StObject.set(x, "MediaStreamName", js.undefined)
  }
}
