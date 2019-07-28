package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CascadeCols extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var prefixCls: String
  var value: js.Array[scala.Nothing]
  def onChange(): Unit
}

object Anon_CascadeCols {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    onChange: () => Unit,
    pickerPrefixCls: String,
    prefixCls: String,
    value: js.Array[scala.Nothing]
  ): Anon_CascadeCols = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, onChange = js.Any.fromFunction0(onChange), pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, value = value)
  
    __obj.asInstanceOf[Anon_CascadeCols]
  }
}

