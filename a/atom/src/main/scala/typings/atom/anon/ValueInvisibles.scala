package typings.atom.anon

import typings.atom.mod.Invisibles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueInvisibles extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: Invisibles
}
object ValueInvisibles {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Invisibles): ValueInvisibles = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueInvisibles]
  }
  
  extension [Self <: ValueInvisibles](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Invisibles): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
