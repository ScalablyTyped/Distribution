package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillSymbolProperties extends SymbolProperties {
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-fill` | `picture-fill`] = js.native
}

object FillSymbolProperties {
  @scala.inline
  def apply(): FillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbolProperties]
  }
  @scala.inline
  implicit class FillSymbolPropertiesOps[Self <: FillSymbolProperties] (val x: Self) extends AnyVal {
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
    def setOutline(value: SimpleLineSymbolProperties): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setType(value: `simple-fill` | `picture-fill`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

