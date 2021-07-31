package typings.atom.anon

import typings.atom.atomStrings.Cursor
import typings.atom.atomStrings.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: Word | Cursor
}
object `21` {
  
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Word | Cursor): `21` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Word | Cursor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
