package typings
package atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/component_factory", "ComponentFactory")
@js.native
abstract class ComponentFactory[C] () extends js.Object {
  /**
       * The component's type
       */
  val componentType: atAngularCoreLib.srcTypeMod.Type[_] = js.native
  /**
       * The inputs of the component.
       */
  val inputs: js.Array[atAngularCoreLib.Anon_PropName] = js.native
  /**
       * Selector for all <ng-content> elements in the component.
       */
  val ngContentSelectors: js.Array[java.lang.String] = js.native
  /**
       * The outputs of the component.
       */
  val outputs: js.Array[atAngularCoreLib.Anon_PropName] = js.native
  /**
       * The component's HTML selector.
       */
  val selector: java.lang.String = js.native
  /**
       * Creates a new component.
       */
  def create(injector: atAngularCoreLib.srcDiInjectorMod.Injector): ComponentRef[C] = js.native
  /**
       * Creates a new component.
       */
  def create(injector: atAngularCoreLib.srcDiInjectorMod.Injector, projectableNodes: js.Array[js.Array[_]]): ComponentRef[C] = js.native
  /**
       * Creates a new component.
       */
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: java.lang.String
  ): ComponentRef[C] = js.native
  /**
       * Creates a new component.
       */
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: java.lang.String,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): ComponentRef[C] = js.native
  /**
       * Creates a new component.
       */
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any
  ): ComponentRef[C] = js.native
  /**
       * Creates a new component.
       */
  def create(
    injector: atAngularCoreLib.srcDiInjectorMod.Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any,
    ngModule: atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleRef[_]
  ): ComponentRef[C] = js.native
}

