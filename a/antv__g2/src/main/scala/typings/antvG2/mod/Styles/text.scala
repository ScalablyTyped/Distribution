package typings.antvG2.mod.Styles

import typings.antvG2.antvG2Strings.`small-caps`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.italic
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.normal
import typings.antvG2.antvG2Strings.oblique
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.start
import typings.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait text extends common {
  var font: js.UndefOr[String] = js.native
  /**
    * 文本字体名称
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * 文本字号大小
    */
  var fontSize: js.UndefOr[String | Double] = js.native
  /**
    * 文本样式
    */
  var fontStyle: js.UndefOr[normal | italic | oblique] = js.native
  /**
    * 文本变体
    */
  var fontVariant: js.UndefOr[normal | `small-caps`] = js.native
  /**
    * 文本粗细
    */
  var fontWeight: js.UndefOr[String | Double] = js.native
  /**
    * 文本旋转角度
    */
  var rotate: js.UndefOr[Double] = js.native
  /**
    * 文本对齐方向
    */
  var textAlign: js.UndefOr[center | end | left | right | start] = js.native
  /**
    * 文本基准线，默认为`middle`
    */
  var textBaseline: js.UndefOr[top | middle | bottom] = js.native
}

object text {
  @scala.inline
  def apply(): text = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[text]
  }
  @scala.inline
  implicit class textOps[Self <: text] (val x: Self) extends AnyVal {
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
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: String | Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontStyle(value: normal | italic | oblique): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariant(value: normal | `small-caps`): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontWeight(value: String | Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setTextAlign(value: center | end | left | right | start): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextBaseline(value: top | middle | bottom): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBaseline: Self = this.set("textBaseline", js.undefined)
  }
  
}

