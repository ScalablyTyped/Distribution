package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StaticProvider extends StObject
object _StaticProvider {
  
  inline def ConstructorProvider(provide: Type[js.Any]): typings.angularCore.mod.ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ConstructorProvider]
  }
  
  inline def ExistingProvider(provide: js.Any, useExisting: js.Any): typings.angularCore.mod.ExistingProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ExistingProvider]
  }
  
  inline def FactoryProvider(provide: js.Any, useFactory: js.Function): typings.angularCore.mod.FactoryProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.FactoryProvider]
  }
  
  inline def StaticClassProvider(deps: js.Array[js.Any], provide: js.Any, useClass: Type[js.Any]): typings.angularCore.mod.StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.StaticClassProvider]
  }
  
  inline def ValueProvider(provide: js.Any, useValue: js.Any): typings.angularCore.mod.ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ValueProvider]
  }
}
