package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledHours extends js.Object {
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
}

object Anon_DisabledHours {
  @scala.inline
  def apply(
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: () => js.Array[Double] = null,
    disabledSeconds: () => js.Array[Double] = null
  ): Anon_DisabledHours = {
    val __obj = js.Dynamic.literal()
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction0(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction0(disabledSeconds))
    __obj.asInstanceOf[Anon_DisabledHours]
  }
}

