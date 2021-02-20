package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderDef extends StObject {
  
  var deps: js.Array[DepDef] = js.native
  
  var token: js.Any = js.native
  
  var value: js.Any = js.native
}
object ProviderDef {
  
  @scala.inline
  def apply(deps: js.Array[DepDef], token: js.Any, value: js.Any): ProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderDef]
  }
  
  @scala.inline
  implicit class ProviderDefMutableBuilder[Self <: ProviderDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[DepDef]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: DepDef*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
