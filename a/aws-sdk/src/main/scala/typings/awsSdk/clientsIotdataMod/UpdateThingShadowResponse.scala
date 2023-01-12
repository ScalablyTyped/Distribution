package typings.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingShadowResponse extends StObject {
  
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[JsonDocument] = js.undefined
}
object UpdateThingShadowResponse {
  
  inline def apply(): UpdateThingShadowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingShadowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThingShadowResponse] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
