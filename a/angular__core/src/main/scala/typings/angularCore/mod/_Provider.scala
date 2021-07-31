package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Provider extends StObject
object _Provider {
  
  @scala.inline
  def ClassProvider(provide: js.Any, useClass: Type[js.Any]): typings.angularCore.mod.ClassProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ClassProvider]
  }
  
  @scala.inline
  def ConstructorProvider(provide: Type[js.Any]): typings.angularCore.mod.ConstructorProvider = {
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
  def ValueProvider(provide: js.Any, useValue: js.Any): typings.angularCore.mod.ValueProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.mod.ValueProvider]
  }
}
