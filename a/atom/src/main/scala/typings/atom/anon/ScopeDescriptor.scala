package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeDescriptor extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor = js.native
  
  var value: js.Array[String] = js.native
}
object ScopeDescriptor {
  
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: js.Array[String]): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptor]
  }
  
  @scala.inline
  implicit class ScopeDescriptorMutableBuilder[Self <: ScopeDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
