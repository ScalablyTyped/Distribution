package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValue extends StObject {
  
  var newValue: js.Array[String]
  
  var oldValue: js.UndefOr[js.Array[String]] = js.undefined
}
object OldValue {
  
  @scala.inline
  def apply(newValue: js.Array[String]): OldValue = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValue]
  }
  
  @scala.inline
  implicit class OldValueMutableBuilder[Self <: OldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: js.Array[String]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueVarargs(value: String*): Self = StObject.set(x, "newValue", js.Array(value :_*))
    
    @scala.inline
    def setOldValue(value: js.Array[String]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setOldValueVarargs(value: String*): Self = StObject.set(x, "oldValue", js.Array(value :_*))
  }
}
