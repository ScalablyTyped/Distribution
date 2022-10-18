package typings.atom.anon

import typings.atom.atomStrings.atom
import typings.atom.atomStrings.experimental
import typings.atom.atomStrings.native
import typings.atom.atomStrings.poll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: native | experimental | poll | atom
}
object `22` {
  
  inline def apply(
    scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: native | experimental | poll | atom
  ): `22` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: native | experimental | poll | atom): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
