package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance of an `NgModule` created by an `NgModuleFactory`.
  * Provides access to the `NgModule` instance and related objects.
  *
  * @publicApi
  */
@js.native
trait NgModuleRef[T] extends StObject {
  
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
