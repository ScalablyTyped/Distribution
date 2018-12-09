package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlRouterProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * Disables (or enables) deferring location change interception.
               *
               * If you wish to customize the behavior of syncing the URL (for example, if you wish to defer a transition but maintain the current URL), call this method at configuration time. Then, at run time, call $urlRouter.listen() after you have configured your own $locationChangeSuccess event handler.
               *
               * @param {boolean} defer Indicates whether to defer location change interception. Passing no parameter is equivalent to true.
               */
  def deferIntercept(): scala.Unit = js.native
  /**
               * Disables (or enables) deferring location change interception.
               *
               * If you wish to customize the behavior of syncing the URL (for example, if you wish to defer a transition but maintain the current URL), call this method at configuration time. Then, at run time, call $urlRouter.listen() after you have configured your own $locationChangeSuccess event handler.
               *
               * @param {boolean} defer Indicates whether to defer location change interception. Passing no parameter is equivalent to true.
               */
  def deferIntercept(defer: scala.Boolean): scala.Unit = js.native
  def otherwise(handler: angularLib.angularMod.Global.Function): IUrlRouterProvider = js.native
  def otherwise(handler: js.Array[_]): IUrlRouterProvider = js.native
  def otherwise(path: java.lang.String): IUrlRouterProvider = js.native
  def rule(handler: angularLib.angularMod.Global.Function): IUrlRouterProvider = js.native
  def rule(handler: js.Array[_]): IUrlRouterProvider = js.native
  def when(whenPath: IUrlMatcher, handler: js.Array[_]): IUrlRouterProvider = js.native
  def when(whenPath: IUrlMatcher, hanlder: angularLib.angularMod.Global.Function): IUrlRouterProvider = js.native
  def when(whenPath: IUrlMatcher, toPath: java.lang.String): IUrlRouterProvider = js.native
  def when(whenPath: java.lang.String, handler: angularLib.angularMod.Global.Function): IUrlRouterProvider = js.native
  def when(whenPath: java.lang.String, handler: js.Array[_]): IUrlRouterProvider = js.native
  def when(whenPath: java.lang.String, toPath: java.lang.String): IUrlRouterProvider = js.native
  def when(whenPath: stdLib.RegExp, handler: angularLib.angularMod.Global.Function): IUrlRouterProvider = js.native
  def when(whenPath: stdLib.RegExp, handler: js.Array[_]): IUrlRouterProvider = js.native
  def when(whenPath: stdLib.RegExp, toPath: java.lang.String): IUrlRouterProvider = js.native
}

