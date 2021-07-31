package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValueOldValue extends StObject {
  
  var newValue: Boolean
  
  var oldValue: js.UndefOr[Boolean] = js.undefined
}
object NewValueOldValue {
  
  @scala.inline
  def apply(newValue: Boolean): NewValueOldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueOldValue]
  }
  
  @scala.inline
  implicit class NewValueOldValueMutableBuilder[Self <: NewValueOldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: Boolean): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Boolean): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
