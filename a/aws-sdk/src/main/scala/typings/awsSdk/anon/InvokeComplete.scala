package typings.awsSdk.anon

import typings.awsSdk.clientsLambdaMod.InvokeResponseStreamUpdate
import typings.awsSdk.clientsLambdaMod.InvokeWithResponseStreamCompleteEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeComplete extends StObject {
  
  var InvokeComplete: js.UndefOr[InvokeWithResponseStreamCompleteEvent] = js.undefined
  
  var PayloadChunk: js.UndefOr[InvokeResponseStreamUpdate] = js.undefined
}
object InvokeComplete {
  
  inline def apply(): InvokeComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeComplete] (val x: Self) extends AnyVal {
    
    inline def setInvokeComplete(value: InvokeWithResponseStreamCompleteEvent): Self = StObject.set(x, "InvokeComplete", value.asInstanceOf[js.Any])
    
    inline def setInvokeCompleteUndefined: Self = StObject.set(x, "InvokeComplete", js.undefined)
    
    inline def setPayloadChunk(value: InvokeResponseStreamUpdate): Self = StObject.set(x, "PayloadChunk", value.asInstanceOf[js.Any])
    
    inline def setPayloadChunkUndefined: Self = StObject.set(x, "PayloadChunk", js.undefined)
  }
}
