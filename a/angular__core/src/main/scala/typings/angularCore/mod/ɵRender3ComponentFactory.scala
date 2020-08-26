package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275Render3ComponentFactory")
@js.native
class ɵRender3ComponentFactory[T] protected () extends ComponentFactory[T] {
  /**
    * @param componentDef The component definition.
    * @param ngModule The NgModuleRef to which the factory is bound.
    */
  def this(componentDef: ɵComponentDef[_]) = this()
  def this(componentDef: ɵComponentDef[_], ngModule: NgModuleRef[_]) = this()
  var componentDef: js.Any = js.native
  @JSName("componentType")
  var componentType_FɵRender3ComponentFactory: Type[_] = js.native
  var isBoundToModule: Boolean = js.native
  @JSName("ngContentSelectors")
  var ngContentSelectors_FɵRender3ComponentFactory: js.Array[String] = js.native
  var ngModule: js.Any = js.native
  @JSName("selector")
  var selector_FɵRender3ComponentFactory: String = js.native
}

