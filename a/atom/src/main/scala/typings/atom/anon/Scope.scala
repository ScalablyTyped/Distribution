package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  var scope: js.Array[String] | typings.atom.mod.ScopeDescriptor
}
object Scope {
  
  inline def apply(scope: js.Array[String] | typings.atom.mod.ScopeDescriptor): Scope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setScope(value: js.Array[String] | typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
