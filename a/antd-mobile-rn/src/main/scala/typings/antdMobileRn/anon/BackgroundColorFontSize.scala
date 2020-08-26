package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColorFontSize extends js.Object {
  var backgroundColor: String = js.native
  var fontSize: Double = js.native
  var lineHeight: Double = js.native
  var paddingHorizontal: Double = js.native
  var textAlignVertical: String = js.native
}

object BackgroundColorFontSize {
  @scala.inline
  def apply(
    backgroundColor: String,
    fontSize: Double,
    lineHeight: Double,
    paddingHorizontal: Double,
    textAlignVertical: String
  ): BackgroundColorFontSize = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorFontSize]
  }
  @scala.inline
  implicit class BackgroundColorFontSizeOps[Self <: BackgroundColorFontSize] (val x: Self) extends AnyVal {
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
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = this.set("paddingHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlignVertical(value: String): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
  }
  
}

