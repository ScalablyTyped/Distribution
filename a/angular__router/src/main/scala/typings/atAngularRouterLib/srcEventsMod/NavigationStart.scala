package typings
package atAngularRouterLib.srcEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/events", "NavigationStart")
@js.native
class NavigationStart protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.hashchange) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.imperative) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.popstate) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.hashchange, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_NavigationId) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.imperative, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_NavigationId) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.popstate, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_NavigationId) = this()
  /**
    * Identifies the trigger of the navigation.
    *
    * * 'imperative'--triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--triggered by a popstate event
    * * 'hashchange'--triggered by a hashchange event
    */
  var navigationTrigger: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.imperative | atAngularRouterLib.atAngularRouterLibStrings.popstate | atAngularRouterLib.atAngularRouterLibStrings.hashchange
  ] = js.native
  /**
    * This contains the navigation id that pushed the history record that the router navigates
    * back to. This is not null only when the navigation is triggered by a popstate event.
    *
    * The router assigns a navigationId to every router transition/navigation. Even when the user
    * clicks on the back button in the browser, a new navigation id will be created. So from
    * the perspective of the router, the router never "goes back". By using the `restoredState`
    * and its navigationId, you can implement behavior that differentiates between creating new
    * states
    * and popstate events. In the latter case you can restore some remembered state (e.g., scroll
    * position).
    */
  var restoredState: js.UndefOr[atAngularRouterLib.Anon_NavigationId | scala.Null] = js.native
}

