package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "NgModuleRef")
@js.native
open class NgModuleRef[T] () extends StObject {
  
  /**
    * The resolver that can retrieve component factories in a context of this module.
    *
    * Note: since v13, dynamic component creation via
    * [`ViewContainerRef.createComponent`](api/core/ViewContainerRef#createComponent)
    * does **not** require resolving component factory: component class can be used directly.
    *
    * @deprecated Angular no longer requires Component factories. Please use other APIs where
    *     Component class can be used directly.
    */
  def componentFactoryResolver: ComponentFactoryResolver = js.native
  
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  
  /**
    * The injector that contains all of the providers of the `NgModule`.
    */
  def injector: EnvironmentInjector = js.native
  
  /**
    * The `NgModule` instance.
    */
  def instance: T = js.native
  
  /**
    * Registers a callback to be executed when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}
