package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.butt
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The style used to draw the endpoint of a line. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![sls-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-butt.png)
    * round | ![sls-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-round.png)
    * square | ![sls-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-square.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
    *
    * @default butt
    */
  var cap: js.UndefOr[butt | round | square] = js.native
  /**
    * The style used to draw the intersection of two line segments within a line geometry. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![sls-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-bevel.png)
    * miter | ![sls-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-miter.png)
    * round | ![sls-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
    *
    * @default miter
    */
  var join: js.UndefOr[miter | round | bevel] = js.native
  /**
    * The material used to shade the line. This property defines the line's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[LineSymbol3DLayerMaterialProperties] = js.native
  /**
    * The width of the line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    *
    * @default "1px"
    */
  var size: js.UndefOr[Double | String] = js.native
}

object LineSymbol3DLayerProperties {
  @scala.inline
  def apply(): LineSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class LineSymbol3DLayerPropertiesOps[Self <: LineSymbol3DLayerProperties] (val x: Self) extends AnyVal {
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
    def setCap(value: butt | round | square): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setJoin(value: miter | round | bevel): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setMaterial(value: LineSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

