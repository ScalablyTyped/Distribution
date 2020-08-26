package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLScreen extends js.Object {
  @JSName("MSHTML.IHTMLScreen_typekey")
  var MSHTMLDotIHTMLScreen_typekey: IHTMLScreen = js.native
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  var bufferDepth: Double = js.native
  val colorDepth: Double = js.native
  val fontSmoothingEnabled: Boolean = js.native
  val height: Double = js.native
  var updateInterval: Double = js.native
  val width: Double = js.native
}

object IHTMLScreen {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLScreen_typekey: IHTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    updateInterval: Double,
    width: Double
  ): IHTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLScreen_typekey")(MSHTMLDotIHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLScreen]
  }
  @scala.inline
  implicit class IHTMLScreenOps[Self <: IHTMLScreen] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLScreen_typekey(value: IHTMLScreen): Self = this.set("MSHTML.IHTMLScreen_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailHeight(value: Double): Self = this.set("availHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailWidth(value: Double): Self = this.set("availWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferDepth(value: Double): Self = this.set("bufferDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorDepth(value: Double): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSmoothingEnabled(value: Boolean): Self = this.set("fontSmoothingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateInterval(value: Double): Self = this.set("updateInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

