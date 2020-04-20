package typings.antdMobile

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCascade extends js.Object {
  var cascade: Boolean
  var cols: Double
  var pickerPrefixCls: String
  var popupPrefixCls: String
  var prefixCls: String
  var title: String
  var triggerType: String
  def format(values: js.Array[ReactNode]): String | js.Array[ReactNode]
}

object AnonCascade {
  @scala.inline
  def apply(
    cascade: Boolean,
    cols: Double,
    format: js.Array[ReactNode] => String | js.Array[ReactNode],
    pickerPrefixCls: String,
    popupPrefixCls: String,
    prefixCls: String,
    title: String,
    triggerType: String
  ): AnonCascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), pickerPrefixCls = pickerPrefixCls.asInstanceOf[js.Any], popupPrefixCls = popupPrefixCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCascade]
  }
}

