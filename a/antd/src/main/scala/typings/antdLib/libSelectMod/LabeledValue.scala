package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: java.lang.String
  var label: reactLib.reactMod.ReactNs.ReactNode
}

object LabeledValue {
  @scala.inline
  def apply(key: java.lang.String, label: reactLib.reactMod.ReactNs.ReactNode): LabeledValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledValue]
  }
}

