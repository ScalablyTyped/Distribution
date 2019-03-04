package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiViewScrollProvider extends js.Object {
  /*
    * Reverts back to using the core $anchorScroll service for scrolling
    * based on the url anchor.
    */
  def useAnchorScroll(): scala.Unit
}

object IUiViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: js.Function0[scala.Unit]): IUiViewScrollProvider = {
    val __obj = js.Dynamic.literal(useAnchorScroll = useAnchorScroll)
  
    __obj.asInstanceOf[IUiViewScrollProvider]
  }
}

