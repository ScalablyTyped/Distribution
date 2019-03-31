package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CascadeCols extends js.Object {
  var cascade: scala.Boolean
  var cols: scala.Double
  var pickerPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var value: js.Array[scala.Nothing]
  def onChange(): scala.Unit
}

object Anon_CascadeCols {
  @scala.inline
  def apply(
    cascade: scala.Boolean,
    cols: scala.Double,
    onChange: () => scala.Unit,
    pickerPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    value: js.Array[scala.Nothing]
  ): Anon_CascadeCols = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, onChange = js.Any.fromFunction0(onChange), pickerPrefixCls = pickerPrefixCls, prefixCls = prefixCls, value = value)
  
    __obj.asInstanceOf[Anon_CascadeCols]
  }
}

