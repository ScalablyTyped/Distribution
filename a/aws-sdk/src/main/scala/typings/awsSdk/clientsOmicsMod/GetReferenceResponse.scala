package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceResponse extends StObject {
  
  /**
    * The reference file payload.
    */
  var payload: js.UndefOr[ReferenceStreamingBlob] = js.undefined
}
object GetReferenceResponse {
  
  inline def apply(): GetReferenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReferenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: ReferenceStreamingBlob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
