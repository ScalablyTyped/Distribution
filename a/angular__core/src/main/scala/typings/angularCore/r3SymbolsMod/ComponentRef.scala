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
@js.native
trait ComponentRef[C] extends js.Object {
  /**
    * The change detector for this component instance.
    */
  def changeDetectorRef: ChangeDetectorRef = js.native
  /**
    * The type of this component (as created by a `ComponentFactory` class).
    */
  def componentType: Type[_] = js.native
  /**
    * Destroys the component instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * The [host view](guide/glossary#view-tree) defined by the template
    * for this component instance.
    */
  def hostView: ViewRef = js.native
  /**
    * The [dependency injector](guide/glossary#injector) for this component instance.
    */
  def injector: Injector = js.native
  /**
    * This component instance.
    */
  def instance: C = js.native
  /**
    * The host or anchor [element](guide/glossary#element) for this component instance.
    */
  def location: ElementRef[_] = js.native
  /**
    * A lifecycle hook that provides additional developer-defined cleanup
    * functionality for the component.
    * @param callback A handler function that cleans up developer-defined data
    * associated with this component. Called when the `destroy()` method is invoked.
    */
  def onDestroy(callback: js.Function): Unit = js.native
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
  @scala.inline
  implicit class ComponentRefOps[Self <: ComponentRef[_], C] (val x: Self with ComponentRef[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangeDetectorRef(value: () => ChangeDetectorRef): Self = this.set("changeDetectorRef", js.Any.fromFunction0(value))
    @scala.inline
    def setComponentType(value: () => Type[_]): Self = this.set("componentType", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setHostView(value: () => ViewRef): Self = this.set("hostView", js.Any.fromFunction0(value))
    @scala.inline
    def setInjector(value: () => Injector): Self = this.set("injector", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: () => C): Self = this.set("instance", js.Any.fromFunction0(value))
    @scala.inline
    def setLocation(value: () => ElementRef[_]): Self = this.set("location", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDestroy(value: js.Function => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
  }
  
}

