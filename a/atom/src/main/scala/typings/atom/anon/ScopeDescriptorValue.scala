package typings.atom.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: StringDictionary[js.Array[String]]
}
object ScopeDescriptorValue {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: StringDictionary[js.Array[String]]): ScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorValue]
  }
  
  extension [Self <: ScopeDescriptorValue](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
