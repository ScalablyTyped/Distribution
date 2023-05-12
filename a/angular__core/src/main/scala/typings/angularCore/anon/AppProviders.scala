package typings.angularCore.anon

import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.Provider
import typings.angularCore.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppProviders extends StObject {
  
  var appProviders: js.UndefOr[js.Array[Provider | EnvironmentProviders]] = js.undefined
  
  var platformProviders: js.UndefOr[js.Array[Provider]] = js.undefined
  
  var rootComponent: js.UndefOr[Type[Any]] = js.undefined
}
object AppProviders {
  
  inline def apply(): AppProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppProviders] (val x: Self) extends AnyVal {
    
    inline def setAppProviders(value: js.Array[Provider | EnvironmentProviders]): Self = StObject.set(x, "appProviders", value.asInstanceOf[js.Any])
    
    inline def setAppProvidersUndefined: Self = StObject.set(x, "appProviders", js.undefined)
    
    inline def setAppProvidersVarargs(value: (Provider | EnvironmentProviders)*): Self = StObject.set(x, "appProviders", js.Array(value*))
    
    inline def setPlatformProviders(value: js.Array[Provider]): Self = StObject.set(x, "platformProviders", value.asInstanceOf[js.Any])
    
    inline def setPlatformProvidersUndefined: Self = StObject.set(x, "platformProviders", js.undefined)
    
    inline def setPlatformProvidersVarargs(value: Provider*): Self = StObject.set(x, "platformProviders", js.Array(value*))
    
    inline def setRootComponent(value: Type[Any]): Self = StObject.set(x, "rootComponent", value.asInstanceOf[js.Any])
    
    inline def setRootComponentUndefined: Self = StObject.set(x, "rootComponent", js.undefined)
  }
}
