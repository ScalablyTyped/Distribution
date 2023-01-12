package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleInts.`4`
import typings.actionsOnGoogle.distCommonMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageCustomPayload
  extends StObject
     with DialogflowV1BaseMessage[`4`]
     with DialogflowV1Message {
  
  var payload: js.UndefOr[JsonObject] = js.undefined
}
object DialogflowV1MessageCustomPayload {
  
  inline def apply(): DialogflowV1MessageCustomPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageCustomPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1MessageCustomPayload] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: JsonObject): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
