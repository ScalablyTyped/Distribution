package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import typings.angular.angularMod.IServiceProvider
import typings.angular.angularMod._Global_.Function
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlRouterProvider extends IServiceProvider {
  /**
    * Disables (or enables) deferring location change interception.
    *
    * If you wish to customize the behavior of syncing the URL (for example, if you wish to defer a transition but maintain the current URL), call this method at configuration time. Then, at run time, call $urlRouter.listen() after you have configured your own $locationChangeSuccess event handler.
    *
    * @param {boolean} defer Indicates whether to defer location change interception. Passing no parameter is equivalent to true.
    */
  def deferIntercept(): Unit = js.native
  def deferIntercept(defer: Boolean): Unit = js.native
  def otherwise(handler: js.Array[_]): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def otherwise(handler: Function): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def otherwise(path: String): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def rule(handler: js.Array[_]): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def rule(handler: Function): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, handler: js.Array[_]): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, handler: Function): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: String, toPath: String): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    handler: js.Array[_]
  ): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    hanlder: Function
  ): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(
    whenPath: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlMatcher,
    toPath: String
  ): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, handler: js.Array[_]): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, handler: Function): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
  def when(whenPath: RegExp, toPath: String): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IUrlRouterProvider = js.native
}

