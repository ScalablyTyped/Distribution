package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an `NgModule` created by an `NgModuleFactory`.
  * Provides access to the `NgModule` instance and related objects.
  *
  * @publicApi
  */
@js.native
trait NgModuleRef[T] extends js.Object {
  /**
    * The resolver that can retrieve the component factories
    * declared in the `entryComponents` property of the module.
    */
  def componentFactoryResolver: ComponentFactoryResolver = js.native
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * The injector that contains all of the providers of the `NgModule`.
    */
  def injector: Injector = js.native
  /**
    * The `NgModule` instance.
    */
  def instance: T = js.native
  /**
    * Registers a callback to be executed when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}

object NgModuleRef {
  @scala.inline
  def apply[T](
    componentFactoryResolver: () => ComponentFactoryResolver,
    destroy: () => Unit,
    injector: () => Injector,
    instance: () => T,
    onDestroy: js.Function0[Unit] => Unit
  ): NgModuleRef[T] = {
    val __obj = js.Dynamic.literal(componentFactoryResolver = js.Any.fromFunction0(componentFactoryResolver), destroy = js.Any.fromFunction0(destroy), injector = js.Any.fromFunction0(injector), instance = js.Any.fromFunction0(instance), onDestroy = js.Any.fromFunction1(onDestroy))
    __obj.asInstanceOf[NgModuleRef[T]]
  }
  @scala.inline
  implicit class NgModuleRefOps[Self <: NgModuleRef[_], T] (val x: Self with NgModuleRef[T]) extends AnyVal {
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
    def setComponentFactoryResolver(value: () => ComponentFactoryResolver): Self = this.set("componentFactoryResolver", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setInjector(value: () => Injector): Self = this.set("injector", js.Any.fromFunction0(value))
    @scala.inline
    def setInstance(value: () => T): Self = this.set("instance", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDestroy(value: js.Function0[Unit] => Unit): Self = this.set("onDestroy", js.Any.fromFunction1(value))
  }
  
}

