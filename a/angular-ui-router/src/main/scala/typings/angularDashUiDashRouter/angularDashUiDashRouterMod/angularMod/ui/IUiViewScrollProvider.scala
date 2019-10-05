package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiViewScrollProvider extends js.Object {
  /*
    * Reverts back to using the core $anchorScroll service for scrolling
    * based on the url anchor.
    */
  def useAnchorScroll(): Unit
}

object IUiViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: () => Unit): IUiViewScrollProvider = {
    val __obj = js.Dynamic.literal(useAnchorScroll = js.Any.fromFunction0(useAnchorScroll))
  
    __obj.asInstanceOf[IUiViewScrollProvider]
  }
}

