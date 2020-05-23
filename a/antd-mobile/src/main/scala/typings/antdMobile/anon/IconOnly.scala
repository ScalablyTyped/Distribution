package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOnly extends js.Object {
  var `aria-label`: String
  var iconOnly: js.UndefOr[scala.Nothing] = js.undefined
  var label: js.UndefOr[scala.Nothing] = js.undefined
  var role: String
}

object IconOnly {
  @scala.inline
  def apply(`aria-label`: String, role: String): IconOnly = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOnly]
  }
}

