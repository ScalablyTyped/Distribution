package typings
package antdLib.libLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderState extends js.Object {
  var below: scala.Boolean
  var belowShow: js.UndefOr[scala.Boolean] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object SiderState {
  @scala.inline
  def apply(
    below: scala.Boolean,
    belowShow: js.UndefOr[scala.Boolean] = js.undefined,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): SiderState = {
    val __obj = js.Dynamic.literal(below = below)
    if (!js.isUndefined(belowShow)) __obj.updateDynamic("belowShow")(belowShow)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    __obj.asInstanceOf[SiderState]
  }
}

