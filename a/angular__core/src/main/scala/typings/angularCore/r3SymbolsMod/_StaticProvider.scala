package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _StaticProvider extends js.Object

object _StaticProvider {
  @scala.inline
  def FactoryProvider(provide: js.Any, useFactory: js.Function): _StaticProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticProvider]
  }
  @scala.inline
  def StaticClassProvider(deps: js.Array[_], provide: js.Any, useClass: Type[_]): _StaticProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], provide = provide.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticProvider]
  }
  @scala.inline
  def ExistingProvider(provide: js.Any, useExisting: js.Any): _StaticProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticProvider]
  }
  @scala.inline
  def ConstructorProvider(provide: Type[_]): _StaticProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticProvider]
  }
  @scala.inline
  def ValueProvider(provide: js.Any, useValue: js.Any): _StaticProvider = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], useValue = useValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StaticProvider]
  }
}

