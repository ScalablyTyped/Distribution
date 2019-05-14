package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsIndefiniteForm extends js.Object {
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined
  var length: scala.Double
  var longFormUsed: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsIndefiniteForm {
  @scala.inline
  def apply(
    length: scala.Double,
    isIndefiniteForm: js.UndefOr[scala.Boolean] = js.undefined,
    longFormUsed: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length)
    if (!js.isUndefined(isIndefiniteForm)) __obj.updateDynamic("isIndefiniteForm")(isIndefiniteForm)
    if (!js.isUndefined(longFormUsed)) __obj.updateDynamic("longFormUsed")(longFormUsed)
    __obj.asInstanceOf[Anon_IsIndefiniteForm]
  }
}

