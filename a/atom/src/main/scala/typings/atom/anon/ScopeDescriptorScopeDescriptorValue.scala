package typings.atom.anon

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptorScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: no | yes | always
}
object ScopeDescriptorScopeDescriptorValue {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: no | yes | always): ScopeDescriptorScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptorValue]
  }
  
  extension [Self <: ScopeDescriptorScopeDescriptorValue](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: no | yes | always): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
