package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arialabel extends js.Object {
  var `aria-label`: js.UndefOr[scala.Nothing] = js.undefined
  var iconOnly: Boolean
  var label: String
  var role: js.UndefOr[scala.Nothing] = js.undefined
}

object Arialabel {
  @scala.inline
  def apply(iconOnly: Boolean, label: String): Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
}

