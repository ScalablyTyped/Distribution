package typings.angularUiRouter.mod.angularAugmentingMod.ui

import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUrlRouterService extends js.Object {
  
  def href(urlMatcher: IUrlMatcher): String = js.native
  def href(urlMatcher: IUrlMatcher, params: js.UndefOr[scala.Nothing], options: IHrefOptions): String = js.native
  def href(urlMatcher: IUrlMatcher, params: IStateParamsService): String = js.native
  def href(urlMatcher: IUrlMatcher, params: IStateParamsService, options: IHrefOptions): String = js.native
  
  def listen(): Function = js.native
  
  def push(urlMatcher: IUrlMatcher): Unit = js.native
  def push(urlMatcher: IUrlMatcher, params: js.UndefOr[scala.Nothing], options: IHrefOptions): Unit = js.native
  def push(urlMatcher: IUrlMatcher, params: IStateParamsService): Unit = js.native
  def push(urlMatcher: IUrlMatcher, params: IStateParamsService, options: IHrefOptions): Unit = js.native
  
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
