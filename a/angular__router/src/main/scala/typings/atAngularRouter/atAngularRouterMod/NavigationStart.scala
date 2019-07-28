package typings.atAngularRouter.atAngularRouterMod

import typings.atAngularRouter.Anon_K
import typings.atAngularRouter.atAngularRouterStrings.hashchange
import typings.atAngularRouter.atAngularRouterStrings.imperative
import typings.atAngularRouter.atAngularRouterStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "NavigationStart")
@js.native
class NavigationStart protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: Double, /** @docsNotRequired */
  url: String) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: hashchange
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: imperative
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: popstate
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: hashchange,
    /** @docsNotRequired */
  restoredState: Anon_K
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: imperative,
    /** @docsNotRequired */
  restoredState: Anon_K
  ) = this()
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  navigationTrigger: popstate,
    /** @docsNotRequired */
  restoredState: Anon_K
  ) = this()
  /**
    * Identifies the call or event that triggered the navigation.
    * An `imperative` trigger is a call to `router.navigateByUrl()` or `router.navigate()`.
    *
    */
  var navigationTrigger: js.UndefOr[imperative | popstate | hashchange] = js.native
  /**
    * The navigation state that was previously supplied to the `pushState` call,
    * when the navigation is triggered by a `popstate` event. Otherwise null.
    *
    * The state object is defined by `NavigationExtras`, and contains any
    * developer-defined state value, as well as a unique ID that
    * the router assigns to every router transition/navigation.
    *
    * From the perspective of the router, the router never "goes back".
    * When the user clicks on the back button in the browser,
    * a new navigation ID is created.
    *
    * Use the ID in this previous-state object to differentiate between a newly created
    * state and one returned to by a `popstate` event, so that you can restore some
    * remembered state, such as scroll position.
    *
    */
  var restoredState: js.UndefOr[Anon_K | Null] = js.native
}

