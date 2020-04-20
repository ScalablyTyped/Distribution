package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an instance of an NgModule created via a {@link NgModuleFactory}.
  *
  * `NgModuleRef` provides access to the NgModule Instance as well other objects related to this
  * NgModule Instance.
  *
  * @publicApi
  */
trait NgModuleRef[T] extends js.Object {
  /**
    * The ComponentFactoryResolver to get hold of the ComponentFactories
    * declared in the `entryComponents` property of the module.
    */
  def componentFactoryResolver: ComponentFactoryResolver
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit
  /**
    * The injector that contains all of the providers of the NgModule.
    */
  def injector: Injector
  /**
    * The NgModule instance.
    */
  def instance: T
  /**
    * Allows to register a callback that will be called when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit
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
}

