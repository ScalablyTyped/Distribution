package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveStyle extends js.Object {
  var disabled: Boolean
  var `inline`: Boolean
  var loading: Boolean
  var prefixCls: String
  var size: String
}

object Anon_ActiveStyle {
  @scala.inline
  def apply(disabled: Boolean, `inline`: Boolean, loading: Boolean, prefixCls: String, size: String): Anon_ActiveStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled, loading = loading, prefixCls = prefixCls, size = size)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_ActiveStyle]
  }
}

