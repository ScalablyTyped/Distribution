package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275Render3ComponentFactory")
@js.native
class ɵRender3ComponentFactory[T] protected () extends ComponentFactory[T] {
  /**
    * @param componentDef The component definition.
    * @param ngModule The NgModuleRef to which the factory is bound.
    */
  def this(componentDef: ɵComponentDef[js.Any]) = this()
  def this(componentDef: ɵComponentDef[js.Any], ngModule: NgModuleRef[js.Any]) = this()
  
  /* private */ var componentDef: js.Any = js.native
  
  @JSName("componentType")
  var componentType_FɵRender3ComponentFactory: Type[js.Any] = js.native
  
  var isBoundToModule: Boolean = js.native
  
  @JSName("ngContentSelectors")
  var ngContentSelectors_FɵRender3ComponentFactory: js.Array[String] = js.native
  
  /* private */ var ngModule: js.Any = js.native
  
  @JSName("selector")
  var selector_FɵRender3ComponentFactory: String = js.native
}
