package typings.antd.esLayoutSiderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderState extends js.Object {
  var below: Boolean
  var belowShow: js.UndefOr[Boolean] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
}

object SiderState {
  @scala.inline
  def apply(
    below: Boolean,
    belowShow: js.UndefOr[Boolean] = js.undefined,
    collapsed: js.UndefOr[Boolean] = js.undefined
  ): SiderState = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
    if (!js.isUndefined(belowShow)) __obj.updateDynamic("belowShow")(belowShow.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderState]
  }
}

