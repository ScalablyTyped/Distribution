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
  *
  * @deprecated Angular no longer requires Component factories. Please use other APIs where
  *     Component class can be used directly.
  */
/* note: abstract class */ @JSImport("@angular/core", "ComponentFactory")
@js.native
open class ComponentFactory[C] () extends StObject {
  
  /**
    * The type of component the factory will create.
    */
  def componentType: Type[Any] = js.native
  
  /**
    * Creates a new component.
    */
  def create(injector: Injector): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[Any]]): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[Any]], rootSelectorOrNode: String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: String,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: String,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[Any]], rootSelectorOrNode: Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: Any,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: Any,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[Any]],
    rootSelectorOrNode: Unit,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: Unit, rootSelectorOrNode: String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: String,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: String,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: Unit, rootSelectorOrNode: Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: Any,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: Any,
    environmentInjector: NgModuleRef[Any]
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: Unit,
    environmentInjector: EnvironmentInjector
  ): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: Unit,
    rootSelectorOrNode: Unit,
    environmentInjector: NgModuleRef[Any]
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
