package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingBottom extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var borderRadius: Double = js.native
  var borderWidth: Double = js.native
  var flexDirection: String = js.native
  var paddingBottom: Double = js.native
}

object PaddingBottom {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    flexDirection: String,
    paddingBottom: Double
  ): PaddingBottom = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], paddingBottom = paddingBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottom]
  }
  @scala.inline
  implicit class PaddingBottomOps[Self <: PaddingBottom] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlexDirection(value: String): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
  }
  
}

