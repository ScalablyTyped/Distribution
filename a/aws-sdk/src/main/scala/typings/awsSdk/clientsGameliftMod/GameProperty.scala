package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameProperty extends StObject {
  
  /**
    * The game property identifier.
    */
  var Key: GamePropertyKey
  
  /**
    * The game property value.
    */
  var Value: GamePropertyValue
}
object GameProperty {
  
  inline def apply(Key: GamePropertyKey, Value: GamePropertyValue): GameProperty = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameProperty]
  }
  
  extension [Self <: GameProperty](x: Self) {
    
    inline def setKey(value: GamePropertyKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: GamePropertyValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
