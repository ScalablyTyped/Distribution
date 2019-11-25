package typings.antd.esSelectMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: String
  var label: ReactNode
}

object LabeledValue {
  @scala.inline
  def apply(key: String, label: ReactNode = null): LabeledValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

