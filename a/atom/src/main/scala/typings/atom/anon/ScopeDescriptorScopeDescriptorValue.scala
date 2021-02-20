package typings.atom.anon

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeDescriptorScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor = js.native
  
  var value: no | yes | always = js.native
}
object ScopeDescriptorScopeDescriptorValue {
  
  @scala.inline
  def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: no | yes | always): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
  
  @scala.inline
  implicit class ScopeDescriptorScopeDescriptorValueMutableBuilder[Self <: ScopeDescriptorScopeDescriptorValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: no | yes | always): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
