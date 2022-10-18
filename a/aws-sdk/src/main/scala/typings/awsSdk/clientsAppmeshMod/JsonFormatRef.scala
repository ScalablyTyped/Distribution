package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonFormatRef extends StObject {
  
  /**
    * The specified key for the JSON.
    */
  var key: JsonKey
  
  /**
    * The specified value for the JSON.
    */
  var value: JsonValue
}
object JsonFormatRef {
  
  inline def apply(key: JsonKey, value: JsonValue): JsonFormatRef = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonFormatRef]
  }
  
  extension [Self <: JsonFormatRef](x: Self) {
    
    inline def setKey(value: JsonKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: JsonValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
