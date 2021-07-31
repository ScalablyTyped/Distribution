package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scope extends StObject {
  
  var scope: js.Array[String] | typings.atom.mod.ScopeDescriptor
}
object Scope {
  
  @scala.inline
  def apply(scope: js.Array[String] | typings.atom.mod.ScopeDescriptor): Scope = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  @scala.inline
  implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: js.Array[String] | typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
