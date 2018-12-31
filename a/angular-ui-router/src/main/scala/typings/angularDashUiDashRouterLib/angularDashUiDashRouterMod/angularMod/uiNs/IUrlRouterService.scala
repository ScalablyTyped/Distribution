package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlRouterService extends js.Object {
  def href(urlMatcher: IUrlMatcher): java.lang.String = js.native
  def href(urlMatcher: IUrlMatcher, params: IStateParamsService): java.lang.String = js.native
  def href(urlMatcher: IUrlMatcher, params: IStateParamsService, options: IHrefOptions): java.lang.String = js.native
  def listen(): angularLib.angularMod.Global.Function = js.native
  def push(urlMatcher: IUrlMatcher): scala.Unit = js.native
  def push(urlMatcher: IUrlMatcher, params: IStateParamsService): scala.Unit = js.native
  def push(urlMatcher: IUrlMatcher, params: IStateParamsService, options: IHrefOptions): scala.Unit = js.native
  /*
    * Triggers an update; the same update that happens when the address bar
    * url changes, aka $locationChangeSuccess.
    *
    * This method is useful when you need to use preventDefault() on the
    * $locationChangeSuccess event, perform some custom logic (route protection,
    * auth, config, redirection, etc) and then finally proceed with the transition
    * by calling $urlRouter.sync().
    *
    */
  def sync(): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(read: scala.Boolean): scala.Unit = js.native
}

