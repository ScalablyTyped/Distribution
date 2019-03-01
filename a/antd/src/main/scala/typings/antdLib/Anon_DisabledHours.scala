package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledHours extends js.Object {
  var disabledHours: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
}

object Anon_DisabledHours {
  @scala.inline
  def apply(
    disabledHours: js.Function0[js.Array[scala.Double]] = null,
    disabledMinutes: js.Function0[js.Array[scala.Double]] = null,
    disabledSeconds: js.Function0[js.Array[scala.Double]] = null
  ): Anon_DisabledHours = {
    val __obj = js.Dynamic.literal()
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(disabledHours)
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(disabledMinutes)
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(disabledSeconds)
    __obj.asInstanceOf[Anon_DisabledHours]
  }
}

