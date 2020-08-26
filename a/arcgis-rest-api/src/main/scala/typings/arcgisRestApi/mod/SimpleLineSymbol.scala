package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSLS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleLineSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.native
  @JSName("style")
  var style_SimpleLineSymbol: js.UndefOr[SimpleLineSymbolStyle] = js.native
  @JSName("type")
  var type_SimpleLineSymbol: esriSLS = js.native
  var width: js.UndefOr[Double] = js.native
}

object SimpleLineSymbol {
  @scala.inline
  def apply(`type`: esriSLS): SimpleLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLineSymbol]
  }
  @scala.inline
  implicit class SimpleLineSymbolOps[Self <: SimpleLineSymbol] (val x: Self) extends AnyVal {
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
    def setType(value: esriSLS): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setStyle(value: SimpleLineSymbolStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

