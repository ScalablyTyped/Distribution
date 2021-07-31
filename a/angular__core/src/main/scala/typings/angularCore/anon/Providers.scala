package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Providers extends StObject {
  
  var providers: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var useJit: js.UndefOr[Boolean] = js.undefined
}
object Providers {
  
  @scala.inline
  def apply(): Providers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Providers]
  }
  
  @scala.inline
  implicit class ProvidersMutableBuilder[Self <: Providers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviders(value: js.Array[js.Any]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setUseJit(value: Boolean): Self = StObject.set(x, "useJit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJitUndefined: Self = StObject.set(x, "useJit", js.undefined)
  }
}
