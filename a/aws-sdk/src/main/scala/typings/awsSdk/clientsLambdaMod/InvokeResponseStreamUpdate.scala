package typings.awsSdk.clientsLambdaMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeResponseStreamUpdate extends StObject {
  
  /**
    * Data returned by your Lambda function.
    */
  var Payload: js.UndefOr[Buffer] = js.undefined
}
object InvokeResponseStreamUpdate {
  
  inline def apply(): InvokeResponseStreamUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeResponseStreamUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvokeResponseStreamUpdate] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Buffer): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
