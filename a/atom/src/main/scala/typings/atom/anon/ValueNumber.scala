package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueNumber extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor = js.native
  
  var value: Double = js.native
}
object ValueNumber {
  
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Double): ValueNumber = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueNumber]
  }
  
  @scala.inline
  implicit class ValueNumberMutableBuilder[Self <: ValueNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
