package typings.atom.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: StringDictionary[js.Array[String]]
}
object `19` {
  
  inline def apply(
    scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: StringDictionary[js.Array[String]]
  ): `19` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
