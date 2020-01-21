package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveStyle extends js.Object {
  var disabled: Boolean
  var `inline`: Boolean
  var loading: Boolean
  var prefixCls: String
  var size: String
}

object AnonActiveStyle {
  @scala.inline
  def apply(disabled: Boolean, `inline`: Boolean, loading: Boolean, prefixCls: String, size: String): AnonActiveStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveStyle]
  }
}

