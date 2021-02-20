package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275Render3NgModuleRef")
@js.native
class ɵRender3NgModuleRef[T] protected () extends InternalNgModuleRef[T] {
  def this(ngModuleType: typings.angularCore.mod.Type[T]) = this()
  def this(ngModuleType: typings.angularCore.mod.Type[T], _parent: Injector) = this()
  
  var _parent: Injector | Null = js.native
  
  var _r3Injector: R3Injector = js.native
  
  @JSName("componentFactoryResolver")
  val componentFactoryResolver_FɵRender3NgModuleRef: ComponentFactoryResolver2 = js.native
  
  var destroyCbs: js.Array[js.Function0[Unit]] | Null = js.native
  
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.UndefOr[scala.Nothing], injectFlags: InjectFlags): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any, injectFlags: InjectFlags): js.Any = js.native
  
  @JSName("injector")
  var injector_FɵRender3NgModuleRef: Injector = js.native
  
  @JSName("instance")
  var instance_FɵRender3NgModuleRef: T = js.native
}
