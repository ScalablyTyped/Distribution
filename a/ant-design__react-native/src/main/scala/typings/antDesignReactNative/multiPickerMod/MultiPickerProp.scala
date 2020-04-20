package typings.antDesignReactNative.multiPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPickerProp extends js.Object {
  var getValue: js.Function
}

object MultiPickerProp {
  @scala.inline
  def apply(getValue: js.Function): MultiPickerProp = {
    val __obj = js.Dynamic.literal(getValue = getValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPickerProp]
  }
}

