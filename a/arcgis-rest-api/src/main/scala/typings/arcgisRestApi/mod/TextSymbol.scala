package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.baseline
import typings.arcgisRestApi.arcgisRestApiStrings.bottom
import typings.arcgisRestApi.arcgisRestApiStrings.center
import typings.arcgisRestApi.arcgisRestApiStrings.esriTS
import typings.arcgisRestApi.arcgisRestApiStrings.justify
import typings.arcgisRestApi.arcgisRestApiStrings.left
import typings.arcgisRestApi.arcgisRestApiStrings.middle
import typings.arcgisRestApi.arcgisRestApiStrings.right
import typings.arcgisRestApi.arcgisRestApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.native
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.native
  var borderLineSize: js.UndefOr[Double] = js.native
  var color: js.UndefOr[Color] = js.native
  var font: js.UndefOr[Font] = js.native
   // <size>;
  var haloColor: js.UndefOr[Color] = js.native
  var haloSize: js.UndefOr[Double] = js.native
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  var kerning: js.UndefOr[Boolean] = js.native
  var rightToLeft: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  @JSName("type")
  var type_TextSymbol: esriTS = js.native
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
}

object TextSymbol {
  @scala.inline
  def apply(`type`: esriTS): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
  @scala.inline
  implicit class TextSymbolOps[Self <: TextSymbol] (val x: Self) extends AnyVal {
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
    def setType(value: esriTS): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderLineColor(value: Color): Self = this.set("borderLineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLineColor: Self = this.set("borderLineColor", js.undefined)
    @scala.inline
    def setBorderLineSize(value: Double): Self = this.set("borderLineSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLineSize: Self = this.set("borderLineSize", js.undefined)
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHaloColor(value: Color): Self = this.set("haloColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaloColor: Self = this.set("haloColor", js.undefined)
    @scala.inline
    def setHaloSize(value: Double): Self = this.set("haloSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHaloSize: Self = this.set("haloSize", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: left | right | center | justify): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setKerning(value: Boolean): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def setRightToLeft(value: Boolean): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToLeft: Self = this.set("rightToLeft", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: baseline | top | middle | bottom): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

