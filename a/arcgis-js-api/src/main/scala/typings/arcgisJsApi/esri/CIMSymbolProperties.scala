package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CIMSymbolProperties extends SymbolProperties {
  /**
    * The JSON payload of the [CIMSymbolReference](https://github.com/Esri/cim-spec/blob/master/docs/v2/CIMRenderers.md#CIMSymbolReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
    */
  var data: js.UndefOr[js.Any] = js.native
}

object CIMSymbolProperties {
  @scala.inline
  def apply(): CIMSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIMSymbolProperties]
  }
  @scala.inline
  implicit class CIMSymbolPropertiesOps[Self <: CIMSymbolProperties] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

