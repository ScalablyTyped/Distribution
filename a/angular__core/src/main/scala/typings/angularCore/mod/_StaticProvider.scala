package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StaticProvider extends StObject
object _StaticProvider {
  
  @scala.inline
  def ConstructorProvider(provide: typings.angularCore.mod.Type[_]): typings.angularCore.mod.ConstructorProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ConstructorProvider]
  }
  
  @scala.inline
  def ExistingProvider(provide: js.Any, useExisting: js.Any): typings.angularCore.mod.ExistingProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ExistingProvider]
  }
  
  @scala.inline
  def FactoryProvider(provide: js.Any, useFactory: js.Function): typings.angularCore.mod.FactoryProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.FactoryProvider]
  }
  
  @scala.inline
  def StaticClassProvider(deps: js.Array[_], provide: js.Any, useClass: typings.angularCore.mod.Type[_]): typings.angularCore.mod.StaticClassProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.StaticClassProvider]
  }
  
  @scala.inline
  def ValueProvider(provide: js.Any, useValue: js.Any): typings.angularCore.mod.ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ValueProvider]
  }
}
