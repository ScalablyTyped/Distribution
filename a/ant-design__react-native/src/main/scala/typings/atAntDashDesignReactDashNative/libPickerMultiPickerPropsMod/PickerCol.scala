package typings.atAntDashDesignReactDashNative.libPickerMultiPickerPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerCol extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
}

object PickerCol {
  @scala.inline
  def apply(key: String = null, props: js.Any = null): PickerCol = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerCol]
  }
}

