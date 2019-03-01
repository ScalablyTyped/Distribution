package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConstructed extends js.Object {
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  var tagClass: js.UndefOr[scala.Double] = js.undefined
  var tagNumber: js.UndefOr[scala.Double] = js.undefined
}

object Anon_IsConstructed {
  @scala.inline
  def apply(
    isConstructed: js.UndefOr[scala.Boolean] = js.undefined,
    tagClass: scala.Int | scala.Double = null,
    tagNumber: scala.Int | scala.Double = null
  ): Anon_IsConstructed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isConstructed)) __obj.updateDynamic("isConstructed")(isConstructed)
    if (tagClass != null) __obj.updateDynamic("tagClass")(tagClass.asInstanceOf[js.Any])
    if (tagNumber != null) __obj.updateDynamic("tagNumber")(tagNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsConstructed]
  }
}

