package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleFillSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.native
  var outline: js.UndefOr[SimpleLineSymbol] = js.native
  @JSName("style")
  var style_SimpleFillSymbol: js.UndefOr[SimpleFillSymbolStyle] = js.native
  @JSName("type")
  var type_SimpleFillSymbol: esriSFS = js.native
}

object SimpleFillSymbol {
  @scala.inline
  def apply(`type`: esriSFS): SimpleFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFillSymbol]
  }
  @scala.inline
  implicit class SimpleFillSymbolOps[Self <: SimpleFillSymbol] (val x: Self) extends AnyVal {
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
    def setType(value: esriSFS): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOutline(value: SimpleLineSymbol): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setStyle(value: SimpleFillSymbolStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

