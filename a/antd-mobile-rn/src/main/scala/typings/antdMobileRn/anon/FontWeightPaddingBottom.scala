package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontWeightPaddingBottom extends js.Object {
  var color: String = js.native
  var fontSize: Double = js.native
  var fontWeight: String = js.native
  var paddingBottom: Double = js.native
}

object FontWeightPaddingBottom {
  @scala.inline
  def apply(color: String, fontSize: Double, fontWeight: String, paddingBottom: Double): FontWeightPaddingBottom = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightPaddingBottom]
  }
  @scala.inline
  implicit class FontWeightPaddingBottomOps[Self <: FontWeightPaddingBottom] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
  }
  
}

