package typings.angularCore.mod

import typings.angularCore.AnonArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275CodegenComponentFactoryResolver")
@js.native
class ɵCodegenComponentFactoryResolver protected () extends ComponentFactoryResolver {
  def this(
    factories: js.Array[ComponentFactory[_]],
    _parent: ComponentFactoryResolver,
    _ngModule: NgModuleRef[_]
  ) = this()
  var _factories: js.Any = js.native
  var _ngModule: js.Any = js.native
  var _parent: js.Any = js.native
  def resolveComponentFactory[T](component: AnonArgs[T]): ComponentFactory[T] = js.native
}

