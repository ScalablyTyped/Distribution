package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInput extends StObject {
  
  def resetSelection(): Unit
}
object TextInput {
  
  inline def apply(resetSelection: () => Unit): TextInput = {
    val __obj = js.Dynamic.literal(resetSelection = js.Any.fromFunction0(resetSelection))
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
    
    inline def setResetSelection(value: () => Unit): Self = StObject.set(x, "resetSelection", js.Any.fromFunction0(value))
  }
}
