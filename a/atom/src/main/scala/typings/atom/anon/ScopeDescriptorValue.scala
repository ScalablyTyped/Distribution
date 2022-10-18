package typings.atom.anon

import typings.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typings.atom.atomStrings.`tab and enter`
import typings.atom.atomStrings.enter
import typings.atom.atomStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeDescriptorValue extends StObject {
  
  var scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor
  
  var value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
}
object ScopeDescriptorValue {
  
  inline def apply(
    scopeDescriptor: typings.atom.srcScopeDescriptorMod.ScopeDescriptor,
    value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): ScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeDescriptorValue]
  }
  
  extension [Self <: ScopeDescriptorValue](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
