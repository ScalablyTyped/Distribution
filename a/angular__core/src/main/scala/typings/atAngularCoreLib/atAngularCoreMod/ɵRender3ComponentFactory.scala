package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ɵRender3ComponentFactory")
@js.native
class ɵRender3ComponentFactory[T] protected () extends ComponentFactory[T] {
  /**
    * @param componentDef The component definition.
    * @param ngModule The NgModuleRef to which the factory is bound.
    */
  def this(componentDef: ɵComponentDef[_]) = this()
  def this(componentDef: ɵComponentDef[_], ngModule: NgModuleRef[_]) = this()
  var componentDef: js.Any = js.native
  var isBoundToModule: scala.Boolean = js.native
  var ngModule: js.UndefOr[js.Any] = js.native
  def create(injector: Injector, projectableNodes: js.UndefOr[scala.Nothing], rootSelectorOrNode: js.Any): ComponentRef[T] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.UndefOr[scala.Nothing],
    rootSelectorOrNode: js.Any,
    ngModule: NgModuleRef[_]
  ): ComponentRef[T] = js.native
}

