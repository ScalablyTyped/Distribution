package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReadSetResponse extends StObject {
  
  /**
    * The read set file payload.
    */
  var payload: js.UndefOr[ReadSetStreamingBlob] = js.undefined
}
object GetReadSetResponse {
  
  inline def apply(): GetReadSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReadSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReadSetResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: ReadSetStreamingBlob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
