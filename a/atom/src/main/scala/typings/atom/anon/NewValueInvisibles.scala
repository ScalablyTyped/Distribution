package typings.atom.anon

import typings.atom.mod.Invisibles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueInvisibles extends StObject {
  
  var newValue: Invisibles
  
  var oldValue: js.UndefOr[Invisibles] = js.undefined
}
object NewValueInvisibles {
  
  @scala.inline
  def apply(newValue: Invisibles): NewValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueInvisibles]
  }
  
  @scala.inline
  implicit class NewValueInvisiblesMutableBuilder[Self <: NewValueInvisibles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: Invisibles): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Invisibles): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
