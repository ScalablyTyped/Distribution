package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange extends js.Object {
  var disabled: Boolean
  var selectedIndex: Double
  var selectedTextColor: String
  var values: js.Array[scala.Nothing]
  def onChange(): Unit
  def onValueChange(): Unit
}

object AnonOnChange {
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: () => Unit,
    onValueChange: () => Unit,
    selectedIndex: Double,
    selectedTextColor: String,
    values: js.Array[scala.Nothing]
  ): AnonOnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onValueChange = js.Any.fromFunction0(onValueChange), selectedIndex = selectedIndex.asInstanceOf[js.Any], selectedTextColor = selectedTextColor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnChange]
  }
}

