package typings.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderState extends js.Object {
  var below: Boolean
  var collapsed: js.UndefOr[Boolean] = js.undefined
}

object SiderState {
  @scala.inline
  def apply(below: Boolean, collapsed: js.UndefOr[Boolean] = js.undefined): SiderState = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderState]
  }
}

