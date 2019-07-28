package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CascadeCols extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var title: String
  var triggerType: String
  def format(values: js.Array[String]): String
}

object Anon_CascadeCols {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[String] => String,
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    title: String,
    triggerType: String
  ): Anon_CascadeCols = {
    val __obj = js.Dynamic.literal(cascade = cascade, cols = cols, format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls, popupPrefixCls = popupPrefixCls, prefixCls = prefixCls, title = title, triggerType = triggerType)
  
    __obj.asInstanceOf[Anon_CascadeCols]
  }
}

