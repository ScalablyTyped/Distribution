package typings.atom.anon

import typings.atom.atomStrings.none
import typings.atom.atomStrings.textOrSnippet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: none | textOrSnippet
}
object `23` {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: none | textOrSnippet): `23` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: none | textOrSnippet): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
