package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveStyle extends js.Object {
  var disabled: scala.Boolean
  var `inline`: scala.Boolean
  var loading: scala.Boolean
  var prefixCls: java.lang.String
  var size: java.lang.String
}

object Anon_ActiveStyle {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    `inline`: scala.Boolean,
    loading: scala.Boolean,
    prefixCls: java.lang.String,
    size: java.lang.String
  ): Anon_ActiveStyle = {
    val __obj = js.Dynamic.literal(disabled = disabled, loading = loading, prefixCls = prefixCls, size = size)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_ActiveStyle]
  }
}

