package typings
package atAngularCoreLib.srcRender3ComponentUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/component_ref", "ComponentFactory")
@js.native
class ComponentFactory[T] protected ()
  extends atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[T] {
  /**
    * @param componentDef The component definition.
    * @param ngModule The NgModuleRef to which the factory is bound.
    */
  def this(componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_]) = this()
  def this(componentDef: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDef[_], ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]) = this()
  var componentDef: js.Any = js.native
  var ngModule: js.UndefOr[js.Any] = js.native
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.UndefOr[scala.Nothing],
    rootSelectorOrNode: js.Any
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[T] = js.native
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.UndefOr[scala.Nothing],
    rootSelectorOrNode: js.Any,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[T] = js.native
}

