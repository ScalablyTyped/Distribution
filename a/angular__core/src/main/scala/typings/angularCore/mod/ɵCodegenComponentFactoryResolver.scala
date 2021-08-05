package typings.angularCore.mod

import typings.angularCore.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275CodegenComponentFactoryResolver")
@js.native
class ɵCodegenComponentFactoryResolver protected () extends ComponentFactoryResolver {
  def this(
    factories: js.Array[ComponentFactory[js.Any]],
    _parent: ComponentFactoryResolver,
    _ngModule: NgModuleRef[js.Any]
  ) = this()
  
  /* private */ var _factories: js.Any = js.native
  
  /* private */ var _ngModule: js.Any = js.native
  
  /* private */ var _parent: js.Any = js.native
  
  def resolveComponentFactory[T](component: Instantiable[T]): ComponentFactory[T] = js.native
}
