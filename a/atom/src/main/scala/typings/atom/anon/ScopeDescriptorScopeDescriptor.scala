package typings.atom.anon

import typings.atom.mod.FileEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptorScopeDescriptor extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: FileEncoding
}
object ScopeDescriptorScopeDescriptor {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: FileEncoding): ScopeDescriptorScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorScopeDescriptor]
  }
  
  extension [Self <: ScopeDescriptorScopeDescriptor](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FileEncoding): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
