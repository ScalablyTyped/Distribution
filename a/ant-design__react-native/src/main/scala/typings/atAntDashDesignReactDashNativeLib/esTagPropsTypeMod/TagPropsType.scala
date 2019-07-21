package typings
package atAntDashDesignReactDashNativeLib.esTagPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagPropsType extends js.Object {
  var afterClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* selected */ scala.Boolean, scala.Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var small: js.UndefOr[scala.Boolean] = js.undefined
}

object TagPropsType {
  @scala.inline
  def apply(
    afterClose: () => scala.Unit = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* selected */ scala.Boolean => scala.Unit = null,
    onClose: () => scala.Unit = null,
    onLongPress: () => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined
  ): TagPropsType = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(js.Any.fromFunction0(afterClose))
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[TagPropsType]
  }
}

