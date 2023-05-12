package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesState extends StObject {
  
  var attributes: State
  
  var value: String
}
object AttributesState {
  
  inline def apply(attributes: State, value: String): AttributesState = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesState] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: State): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
