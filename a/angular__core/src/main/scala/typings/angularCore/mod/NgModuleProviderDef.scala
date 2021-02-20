package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleProviderDef extends StObject {
  
  var deps: js.Array[DepDef] = js.native
  
  var flags: ɵNodeFlags = js.native
  
  var index: Double = js.native
  
  var token: js.Any = js.native
  
  var value: js.Any = js.native
}
object NgModuleProviderDef {
  
  @scala.inline
  def apply(deps: js.Array[DepDef], flags: ɵNodeFlags, index: Double, token: js.Any, value: js.Any): NgModuleProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleProviderDef]
  }
  
  @scala.inline
  implicit class NgModuleProviderDefMutableBuilder[Self <: NgModuleProviderDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[DepDef]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: DepDef*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
