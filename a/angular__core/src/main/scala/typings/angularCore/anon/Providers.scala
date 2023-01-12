package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Providers extends StObject {
  
  var providers: js.UndefOr[js.Array[Any]] = js.undefined
  
  var useJit: js.UndefOr[Boolean] = js.undefined
}
object Providers {
  
  inline def apply(): Providers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Providers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Providers] (val x: Self) extends AnyVal {
    
    inline def setProviders(value: js.Array[Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Any*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    inline def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
