package typings.atom.anon

import typings.atom.atomStrings.always
import typings.atom.atomStrings.no
import typings.atom.atomStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: no | yes | always
}
object `20` {
  
  inline def apply(scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor, value: no | yes | always): `20` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: no | yes | always): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
