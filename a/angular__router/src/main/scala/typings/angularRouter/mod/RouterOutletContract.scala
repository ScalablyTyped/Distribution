package typings.angularRouter.mod

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EnvironmentInjector
import typings.angularCore.mod.EventEmitter
import typings.angularRouter.angularRouterBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterOutletContract extends StObject {
  
  /**
    * Emits an activate event when a new component is instantiated
    **/
  var activateEvents: js.UndefOr[EventEmitter[Any]] = js.native
  
  /**
    * Called by the `Router` when the outlet should activate (create a component).
    */
  def activateWith(activatedRoute: ActivatedRoute): Unit = js.native
  def activateWith(activatedRoute: ActivatedRoute, environmentInjector: EnvironmentInjector): Unit = js.native
  
  /**
    * The `ActivatedRoute` for the outlet or `null` if the outlet is not activated.
    */
  var activatedRoute: ActivatedRoute | Null = js.native
  
  /**
    * The `Data` of the `ActivatedRoute` snapshot.
    */
  var activatedRouteData: Data = js.native
  
  /**
    * Called when the `RouteReuseStrategy` instructs to re-attach a previously detached subtree.
    */
  def attach(ref: ComponentRef[Any], activatedRoute: ActivatedRoute): Unit = js.native
  
  /**
    * Emits an attached component instance when the `RouteReuseStrategy` instructs to re-attach a
    * previously detached subtree.
    **/
  var attachEvents: js.UndefOr[EventEmitter[Any]] = js.native
  
  /** The instance of the activated component or `null` if the outlet is not activated. */
  var component: js.Object | Null = js.native
  
  /**
    * A request to destroy the currently activated component.
    *
    * When a `RouteReuseStrategy` indicates that an `ActivatedRoute` should be removed but stored for
    * later re-use rather than destroyed, the `Router` will call `detach` instead.
    */
  def deactivate(): Unit = js.native
  
  /**
    * Emits a deactivate event when a component is destroyed.
    */
  var deactivateEvents: js.UndefOr[EventEmitter[Any]] = js.native
  
  /**
    * Called when the `RouteReuseStrategy` instructs to detach the subtree.
    *
    * This is similar to `deactivate`, but the activated component should _not_ be destroyed.
    * Instead, it is returned so that it can be reattached later via the `attach` method.
    */
  def detach(): ComponentRef[Any] = js.native
  
  /**
    * Emits a detached component instance when the `RouteReuseStrategy` instructs to detach the
    * subtree.
    */
  var detachEvents: js.UndefOr[EventEmitter[Any]] = js.native
  
  /**
    * Whether the given outlet is activated.
    *
    * An outlet is considered "activated" if it has an active component.
    */
  var isActivated: Boolean = js.native
  
  /**
    * Used to indicate that the outlet is able to bind data from the `Router` to the outlet
    * component's inputs.
    *
    * When this is `undefined` or `false` and the developer has opted in to the
    * feature using `withComponentInputBinding`, a warning will be logged in dev mode if this outlet
    * is used in the application.
    */
  val supportsBindingToComponentInputs: js.UndefOr[`true`] = js.native
}
