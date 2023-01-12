package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPayload extends StObject {
  
  /**
    * The string that is sent to your application.
    */
  var value: CustomPayloadValue
}
object CustomPayload {
  
  inline def apply(value: CustomPayloadValue): CustomPayload = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPayload] (val x: Self) extends AnyVal {
    
    inline def setValue(value: CustomPayloadValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
