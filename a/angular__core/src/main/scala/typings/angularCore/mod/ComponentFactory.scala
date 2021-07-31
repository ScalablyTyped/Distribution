package typings.angularCore.mod

import typings.angularCore.anon.PropName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for a factory that can create a component dynamically.
  * Instantiate a factory for a given type of component with `resolveComponentFactory()`.
  * Use the resulting `ComponentFactory.create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  *
  * @publicApi
  */
@JSImport("@angular/core", "ComponentFactory")
@js.native
abstract class ComponentFactory[C] () extends StObject {
  
  /**
    * The type of component the factory will create.
    */
  def componentType: Type[js.Any] = js.native
  
  /**
    * Creates a new component.
    */
  def create(injector: Injector): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[js.Any]]): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[js.Any]], rootSelectorOrNode: String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[js.Any]],
    rootSelectorOrNode: String,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[js.Any]], rootSelectorOrNode: js.Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[js.Any]],
    rootSelectorOrNode: js.Any,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[js.Any]],
    rootSelectorOrNode: Unit,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: Unit, rootSelectorOrNode: String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: String,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: Unit, rootSelectorOrNode: js.Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: js.Any,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: Unit,
    ngModule: NgModuleRef[js.Any]
  ): ComponentRef[C] = js.native
  
  /**
    * The inputs of the component.
    */
  def inputs: js.Array[PropName] = js.native
  
  /**
    * Selector for all <ng-content> elements in the component.
    */
  def ngContentSelectors: js.Array[String] = js.native
  
  /**
    * The outputs of the component.
    */
  def outputs: js.Array[PropName] = js.native
  
  /**
    * The component's HTML selector.
    */
  def selector: String = js.native
}
