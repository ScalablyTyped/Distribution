package typings.angularCore.mod

import typings.rxjs.mod.Observable_
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "ApplicationRef")
@js.native
open class ApplicationRef () extends StObject {
  
  /* private */ var _destroyListeners: Any = js.native
  
  /* private */ var _destroyed: Any = js.native
  
  /* private */ val _injector: Any = js.native
  
  /* private */ var _loadComponent: Any = js.native
  
  /* private */ var _runningTick: Any = js.native
  
  /**
    * Attaches a view so that it will be dirty checked.
    * The view will be automatically detached when it is destroyed.
    * This will throw if the view is already attached to a ViewContainer.
    */
  def attachView(viewRef: ViewRef): Unit = js.native
  
  /**
    * Bootstrap a component onto the element identified by its selector or, optionally, to a
    * specified element.
    *
    * @usageNotes
    * ### Bootstrap process
    *
    * When bootstrapping a component, Angular mounts it onto a target DOM element
    * and kicks off automatic change detection. The target DOM element can be
    * provided using the `rootSelectorOrNode` argument.
    *
    * If the target DOM element is not provided, Angular tries to find one on a page
    * using the `selector` of the component that is being bootstrapped
    * (first matched element is used).
    *
    * ### Example
    *
    * Generally, we define the component to bootstrap in the `bootstrap` array of `NgModule`,
    * but it requires us to know the component while writing the application code.
    *
    * Imagine a situation where we have to wait for an API call to decide about the component to
    * bootstrap. We can use the `ngDoBootstrap` hook of the `NgModule` and call this method to
    * dynamically bootstrap a component.
    *
    * {@example core/ts/platform/platform.ts region='componentSelector'}
    *
    * Optionally, a component can be mounted onto a DOM element that does not match the
    * selector of the bootstrapped component.
    *
    * In the following example, we are providing a CSS selector to match the target element.
    *
    * {@example core/ts/platform/platform.ts region='cssSelector'}
    *
    * While in this example, we are providing reference to a DOM node.
    *
    * {@example core/ts/platform/platform.ts region='domNode'}
    *
    * @deprecated Passing Component factories as the `Application.bootstrap` function argument is
    *     deprecated. Pass Component Types instead.
    */
  def bootstrap[C](componentFactory: ComponentFactory[C]): ComponentRef[C] = js.native
  def bootstrap[C](componentFactory: ComponentFactory[C], rootSelectorOrNode: String): ComponentRef[C] = js.native
  def bootstrap[C](componentFactory: ComponentFactory[C], rootSelectorOrNode: Any): ComponentRef[C] = js.native
  /**
    * Bootstrap a component onto the element identified by its selector or, optionally, to a
    * specified element.
    *
    * @usageNotes
    * ### Bootstrap process
    *
    * When bootstrapping a component, Angular mounts it onto a target DOM element
    * and kicks off automatic change detection. The target DOM element can be
    * provided using the `rootSelectorOrNode` argument.
    *
    * If the target DOM element is not provided, Angular tries to find one on a page
    * using the `selector` of the component that is being bootstrapped
    * (first matched element is used).
    *
    * ### Example
    *
    * Generally, we define the component to bootstrap in the `bootstrap` array of `NgModule`,
    * but it requires us to know the component while writing the application code.
    *
    * Imagine a situation where we have to wait for an API call to decide about the component to
    * bootstrap. We can use the `ngDoBootstrap` hook of the `NgModule` and call this method to
    * dynamically bootstrap a component.
    *
    * {@example core/ts/platform/platform.ts region='componentSelector'}
    *
    * Optionally, a component can be mounted onto a DOM element that does not match the
    * selector of the bootstrapped component.
    *
    * In the following example, we are providing a CSS selector to match the target element.
    *
    * {@example core/ts/platform/platform.ts region='cssSelector'}
    *
    * While in this example, we are providing reference to a DOM node.
    *
    * {@example core/ts/platform/platform.ts region='domNode'}
    */
  def bootstrap[C](component: Type[C]): ComponentRef[C] = js.native
  def bootstrap[C](component: Type[C], rootSelectorOrNode: String): ComponentRef[C] = js.native
  def bootstrap[C](component: Type[C], rootSelectorOrNode: Any): ComponentRef[C] = js.native
  
  /**
    * Get a list of component types registered to this application.
    * This list is populated even before the component is created.
    */
  val componentTypes: js.Array[Type[Any]] = js.native
  
  /**
    * Get a list of components registered to this application.
    */
  val components: js.Array[ComponentRef[Any]] = js.native
  
  /**
    * Destroys an Angular application represented by this `ApplicationRef`. Calling this function
    * will destroy the associated environment injectors as well as all the bootstrapped components
    * with their views.
    */
  def destroy(): Unit = js.native
  
  /**
    * Indicates whether this instance was destroyed.
    */
  def destroyed: Boolean = js.native
  
  /**
    * Detaches a view from dirty checking again.
    */
  def detachView(viewRef: ViewRef): Unit = js.native
  
  /**
    * The `EnvironmentInjector` used to create this application.
    */
  def injector: EnvironmentInjector = js.native
  
  /* private */ val internalErrorHandler: Any = js.native
  
  /**
    * Returns an Observable that indicates when the application is stable or unstable.
    */
  val isStable: Observable_[Boolean] = js.native
  
  /**
    * Registers a listener to be called when an instance is destroyed.
    *
    * @param callback A callback function to add as a listener.
    * @returns A function which unregisters a listener.
    */
  def onDestroy(callback: js.Function0[Unit]): VoidFunction = js.native
  
  /**
    * Invoke this method to explicitly process change detection and its side-effects.
    *
    * In development mode, `tick()` also performs a second change detection cycle to ensure that no
    * further changes are detected. If additional changes are picked up during this second cycle,
    * bindings in the app have side-effects that cannot be resolved in a single change detection
    * pass.
    * In this case, Angular throws an error, since an Angular application can only have one change
    * detection pass during which all change detection must complete.
    */
  def tick(): Unit = js.native
  
  /**
    * Returns the number of attached views.
    */
  def viewCount: Double = js.native
  
  /* private */ var warnIfDestroyed: Any = js.native
}
/* static members */
object ApplicationRef {
  
  @JSImport("@angular/core", "ApplicationRef")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "ApplicationRef.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[ApplicationRef, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[ApplicationRef, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "ApplicationRef.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[ApplicationRef] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[ApplicationRef]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
