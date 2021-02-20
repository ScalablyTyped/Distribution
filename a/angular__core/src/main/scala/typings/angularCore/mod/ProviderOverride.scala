package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderOverride extends StObject {
  
  var deprecatedBehavior: Boolean = js.native
  
  var deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _] = js.native
  
  var flags: ɵNodeFlags = js.native
  
  var token: js.Any = js.native
  
  var value: js.Any = js.native
}
object ProviderOverride {
  
  @scala.inline
  def apply(
    deprecatedBehavior: Boolean,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    flags: ɵNodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal(deprecatedBehavior = deprecatedBehavior.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderOverride]
  }
  
  @scala.inline
  implicit class ProviderOverrideMutableBuilder[Self <: ProviderOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecatedBehavior(value: Boolean): Self = StObject.set(x, "deprecatedBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeps(value: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsVarargs(value: ((js.Tuple2[ɵDepFlags, js.Any]) | js.Any)*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
