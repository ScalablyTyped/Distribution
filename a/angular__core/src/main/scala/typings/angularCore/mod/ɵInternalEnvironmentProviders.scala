package typings.angularCore.mod

import typings.angularCore.angularCoreBooleans.`true`
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
  var ɵfromNgModule: js.UndefOr[`true`] = js.undefined
  
  var ɵproviders: js.Array[Provider | EnvironmentProviders]
}
object ɵInternalEnvironmentProviders {
  
  inline def apply(ɵproviders: js.Array[Provider | EnvironmentProviders]): ɵInternalEnvironmentProviders = {
    val __obj = js.Dynamic.literal(ɵbrand = "EnvironmentProviders", ɵproviders = ɵproviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵInternalEnvironmentProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ɵInternalEnvironmentProviders] (val x: Self) extends AnyVal {
    
    inline def setƟfromNgModule(value: `true`): Self = StObject.set(x, "\u0275fromNgModule", value.asInstanceOf[js.Any])
    
    inline def setƟfromNgModuleUndefined: Self = StObject.set(x, "\u0275fromNgModule", js.undefined)
    
    inline def setƟproviders(value: js.Array[Provider | EnvironmentProviders]): Self = StObject.set(x, "\u0275providers", value.asInstanceOf[js.Any])
    
    inline def setƟprovidersVarargs(value: (Provider | EnvironmentProviders)*): Self = StObject.set(x, "\u0275providers", js.Array(value*))
  }
}
