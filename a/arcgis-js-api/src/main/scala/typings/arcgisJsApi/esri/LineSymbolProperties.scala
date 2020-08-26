package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbolProperties extends SymbolProperties {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-line`] = js.native
  /**
    * The width of the symbol in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    *
    * @default 0.75
    */
  var width: js.UndefOr[Double | String] = js.native
}

object LineSymbolProperties {
  @scala.inline
  def apply(): LineSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbolProperties]
  }
  @scala.inline
  implicit class LineSymbolPropertiesOps[Self <: LineSymbolProperties] (val x: Self) extends AnyVal {
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
    def setType(value: `simple-line`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

