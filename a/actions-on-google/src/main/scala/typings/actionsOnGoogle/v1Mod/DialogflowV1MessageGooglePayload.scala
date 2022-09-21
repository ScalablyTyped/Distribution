package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.custom_payload
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageGooglePayload
  extends StObject
     with DialogflowV1BaseGoogleMessage[custom_payload]
     with DialogflowV1Message {
  
  var payload: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
}
object DialogflowV1MessageGooglePayload {
  
  inline def apply(): DialogflowV1MessageGooglePayload = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageGooglePayload]
  }
  
  extension [Self <: DialogflowV1MessageGooglePayload](x: Self) {
    
    inline def setPayload(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
