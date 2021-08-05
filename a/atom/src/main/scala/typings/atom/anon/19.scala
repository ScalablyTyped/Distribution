package typings.atom.anon

import typings.atom.atomStrings.auto
import typings.atom.atomStrings.hard
import typings.atom.atomStrings.soft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var scopeDescriptor: typings.atom.mod.ScopeDescriptor
  
  var value: auto | soft | hard
}
object `19` {
  
  inline def apply(scopeDescriptor: typings.atom.mod.ScopeDescriptor, value: auto | soft | hard): `19` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setScopeDescriptor(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: auto | soft | hard): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
