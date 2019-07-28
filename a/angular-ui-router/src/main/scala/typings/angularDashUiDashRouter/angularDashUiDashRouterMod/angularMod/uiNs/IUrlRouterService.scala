package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs

import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlRouterService extends js.Object {
  def href(urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher): String = js.native
  def href(
    urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher,
    params: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateParamsService
  ): String = js.native
  def href(
    urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher,
    params: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateParamsService,
    options: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IHrefOptions
  ): String = js.native
  def listen(): Function = js.native
  def push(urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher): Unit = js.native
  def push(
    urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher,
    params: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateParamsService
  ): Unit = js.native
  def push(
    urlMatcher: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IUrlMatcher,
    params: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateParamsService,
    options: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IHrefOptions
  ): Unit = js.native
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
  def sync(): Unit = js.native
  def update(): Unit = js.native
  def update(read: Boolean): Unit = js.native
}

