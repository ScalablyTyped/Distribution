package typings.atom.anon

import typings.atom.atomStrings.Bottom
import typings.atom.atomStrings.Left
import typings.atom.atomStrings.Right
import typings.atom.atomStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: Top | Right | Bottom | Left
}
object `18` {
  
  inline def apply(
    scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: Top | Right | Bottom | Left
  ): `18` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Top | Right | Bottom | Left): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
