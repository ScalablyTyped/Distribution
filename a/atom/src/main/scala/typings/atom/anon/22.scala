package typings.atom.anon

import typings.atom.atomStrings.Subsequence
import typings.atom.atomStrings.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: Subsequence | Symbol
}
object `22` {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: Subsequence | Symbol): `22` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Subsequence | Symbol): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
