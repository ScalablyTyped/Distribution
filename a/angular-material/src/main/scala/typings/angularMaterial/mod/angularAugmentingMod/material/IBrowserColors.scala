package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBrowserColors extends js.Object {
  var hue: String = js.native
  var palette: String = js.native
  var theme: String = js.native
}

object IBrowserColors {
  @scala.inline
  def apply(hue: String, palette: String, theme: String): IBrowserColors = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowserColors]
  }
  @scala.inline
  implicit class IBrowserColorsOps[Self <: IBrowserColors] (val x: Self) extends AnyVal {
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
    def setHue(value: String): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPalette(value: String): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
  
}

