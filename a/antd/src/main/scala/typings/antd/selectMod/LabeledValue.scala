package typings.antd.selectMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var label: ReactNode
  var value: RawValue
}

object LabeledValue {
  @scala.inline
  def apply(value: RawValue, key: String = null, label: ReactNode = null): LabeledValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

