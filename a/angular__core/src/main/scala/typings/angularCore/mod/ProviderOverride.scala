package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderOverride extends StObject {
  
  var deprecatedBehavior: Boolean
  
  var deps: js.Array[(js.Tuple2[ɵDepFlags, js.Any]) | js.Any]
  
  var flags: ɵNodeFlags
  
  var token: js.Any
  
  var value: js.Any
}
object ProviderOverride {
  
  inline def apply(
    deprecatedBehavior: Boolean,
    deps: js.Array[(js.Tuple2[ɵDepFlags, js.Any]) | js.Any],
    flags: ɵNodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal(deprecatedBehavior = deprecatedBehavior.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderOverride]
  }
  
  extension [Self <: ProviderOverride](x: Self) {
    
    inline def setDeprecatedBehavior(value: Boolean): Self = StObject.set(x, "deprecatedBehavior", value.asInstanceOf[js.Any])
    
    inline def setDeps(value: js.Array[(js.Tuple2[ɵDepFlags, js.Any]) | js.Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: ((js.Tuple2[ɵDepFlags, js.Any]) | js.Any)*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setFlags(value: ɵNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
