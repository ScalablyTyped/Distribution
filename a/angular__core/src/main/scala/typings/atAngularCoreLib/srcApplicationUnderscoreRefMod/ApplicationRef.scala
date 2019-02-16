package typings
package atAngularCoreLib.srcApplicationUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/application_ref", "ApplicationRef")
@js.native
class ApplicationRef () extends js.Object {
  var _bootstrapListeners: js.Any = js.native
  var _componentFactoryResolver: js.Any = js.native
  var _console: js.Any = js.native
  var _enforceNoNewChanges: js.Any = js.native
  var _exceptionHandler: js.Any = js.native
  var _initStatus: js.Any = js.native
  var _injector: js.Any = js.native
  var _loadComponent: js.Any = js.native
  var _runningTick: js.Any = js.native
  var _stable: js.Any = js.native
  var _unloadComponent: js.Any = js.native
  var _views: js.Any = js.native
  var _zone: js.Any = js.native
  /**
    * Get a list of component types registered to this application.
    * This list is populated even before the component is created.
    */
  val componentTypes: js.Array[atAngularCoreLib.srcTypeMod.Type[_]] = js.native
  /**
    * Get a list of components registered to this application.
    */
  val components: js.Array[atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[_]] = js.native
  /**
    * Returns an Observable that indicates when the application is stable or unstable.
    *
    * @see  [Usage notes](#is-stable-examples) for examples and caveats when using this API.
    */
  val isStable: rxjsLib.rxjsMod.Observable[scala.Boolean] = js.native
  /**
    * Returns the number of attached views.
    */
  val viewCount: scala.Double = js.native
  /**
    * Attaches a view so that it will be dirty checked.
    * The view will be automatically detached when it is destroyed.
    * This will throw if the view is already attached to a ViewContainer.
    */
  def attachView(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef): scala.Unit = js.native
  /**
    * Bootstrap a new component at the root level of the application.
    *
    * @usageNotes
    * ### Bootstrap process
    *
    * When bootstrapping a new root component into an application, Angular mounts the
    * specified application component onto DOM elements identified by the componentType's
    * selector and kicks off automatic change detection to finish initializing the component.
    *
    * Optionally, a component can be mounted onto a DOM element that does not match the
    * componentType's selector.
    *
    * ### Example
    * {@example core/ts/platform/platform.ts region='longform'}
    */
  def bootstrap[C](componentOrFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C]): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  def bootstrap[C](
    componentOrFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    rootSelectorOrNode: java.lang.String
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  def bootstrap[C](
    componentOrFactory: atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentFactory[C],
    rootSelectorOrNode: js.Any
  ): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  def bootstrap[C](componentOrFactory: atAngularCoreLib.srcTypeMod.Type[C]): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  def bootstrap[C](componentOrFactory: atAngularCoreLib.srcTypeMod.Type[C], rootSelectorOrNode: java.lang.String): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  def bootstrap[C](componentOrFactory: atAngularCoreLib.srcTypeMod.Type[C], rootSelectorOrNode: js.Any): atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[C] = js.native
  /**
    * Detaches a view from dirty checking again.
    */
  def detachView(viewRef: atAngularCoreLib.srcLinkerViewUnderscoreRefMod.ViewRef): scala.Unit = js.native
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
  def tick(): scala.Unit = js.native
}

