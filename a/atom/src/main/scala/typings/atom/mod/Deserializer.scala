package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deserializer extends StObject {
  
  def deserialize(state: js.Object): js.Object
  
  var name: String
}
object Deserializer {
  
  @scala.inline
  def apply(deserialize: js.Object => js.Object, name: String): Deserializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deserializer]
  }
  
  @scala.inline
  implicit class DeserializerMutableBuilder[Self <: Deserializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserialize(value: js.Object => js.Object): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
