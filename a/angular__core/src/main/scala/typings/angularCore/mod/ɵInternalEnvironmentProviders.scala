package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵInternalEnvironmentProviders
  extends StObject
     with EnvironmentProviders {
  
  /**
    * If present, indicates that the `EnvironmentProviders` were derived from NgModule providers.
    *
    * This is used to produce clearer error messages.
    */
  var ɵfromNgModule: js.UndefOr[true] = js.undefined
  
  var ɵproviders: js.Array[Provider]
}
object ɵInternalEnvironmentProviders {
  
  inline def apply(ɵproviders: js.Array[Provider]): ɵInternalEnvironmentProviders = {
    val __obj = js.Dynamic.literal(ɵbrand = "EnvironmentProviders", ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵInternalEnvironmentProviders]
  }
  
  extension [Self <: ɵInternalEnvironmentProviders](x: Self) {
    
    inline def setƟfromNgModule(value: true): Self = StObject.set(x, "\u0275fromNgModule", value.asInstanceOf[js.Any])
    
    inline def setƟfromNgModuleUndefined: Self = StObject.set(x, "\u0275fromNgModule", js.undefined)
    
    inline def setƟproviders(value: js.Array[Provider]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: Provider*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
