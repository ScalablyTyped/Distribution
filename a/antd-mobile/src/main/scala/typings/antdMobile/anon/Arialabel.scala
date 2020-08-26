package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arialabel extends js.Object {
  var `aria-label`: js.UndefOr[scala.Nothing] = js.native
  var iconOnly: Boolean = js.native
  var label: String = js.native
  var role: js.UndefOr[scala.Nothing] = js.native
}

object Arialabel {
  @scala.inline
  def apply(iconOnly: Boolean, label: String): Arialabel = {
    val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  @scala.inline
  implicit class ArialabelOps[Self <: Arialabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIconOnly(value: Boolean): Self = this.set("iconOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
  }
  
}

