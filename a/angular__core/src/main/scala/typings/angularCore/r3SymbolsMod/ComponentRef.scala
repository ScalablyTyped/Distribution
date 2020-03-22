package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a component created by a `ComponentFactory`.
  * Provides access to the component instance and related objects,
  * and provides the means of destroying the instance.
  *
  * @publicApi
  */
trait ComponentRef[C] extends js.Object {
  /**
    * The change detector for this component instance.
    */
  def changeDetectorRef(): ChangeDetectorRef
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  def componentType(): Type[_]
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  def hostView(): ViewRef
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  def injector(): Injector
  /**
    * This component instance.
    */
  def instance(): C
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  def location(): ElementRef[_]
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): Unit
}

object ComponentRef {
  @scala.inline
  def apply[C](
    changeDetectorRef: () => ChangeDetectorRef,
    componentType: () => Type[_],
    destroy: () => Unit,
    hostView: () => ViewRef,
    injector: () => Injector,
    instance: () => C,
    location: () => ElementRef[_],
    onDestroy: js.Function => Unit
  ): ComponentRef[C] = {
    val __obj = js.Dynamic.literal(changeDetectorRef = js.Any.fromFunction0(changeDetectorRef), componentType = js.Any.fromFunction0(componentType), destroy = js.Any.fromFunction0(destroy), hostView = js.Any.fromFunction0(hostView), injector = js.Any.fromFunction0(injector), instance = js.Any.fromFunction0(instance), location = js.Any.fromFunction0(location), onDestroy = js.Any.fromFunction1(onDestroy))
  
    __obj.asInstanceOf[ComponentRef[C]]
  }
}

