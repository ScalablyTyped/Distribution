package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptor extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: Boolean
}
object ScopeDescriptor {
  
  inline def apply(scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor, value: Boolean): ScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptor]
  }
  
  extension [Self <: ScopeDescriptor](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
