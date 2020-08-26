package typings.antDesignIcons.iconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoToneColorPaletteSetter extends js.Object {
  var primaryColor: String = js.native
  var secondaryColor: js.UndefOr[String] = js.native
}

object TwoToneColorPaletteSetter {
  @scala.inline
  def apply(primaryColor: String): TwoToneColorPaletteSetter = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoToneColorPaletteSetter]
  }
  @scala.inline
  implicit class TwoToneColorPaletteSetterOps[Self <: TwoToneColorPaletteSetter] (val x: Self) extends AnyVal {
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
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryColor: Self = this.set("secondaryColor", js.undefined)
  }
  
}

