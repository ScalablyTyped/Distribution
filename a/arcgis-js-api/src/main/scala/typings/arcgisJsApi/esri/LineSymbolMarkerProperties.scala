package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`begin-end`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.begin
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.diamond
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.square
import typings.arcgisJsApi.arcgisJsApiStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbolMarkerProperties extends js.Object {
  /**
    * The color of the marker. If not specified, the marker will match the color of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The placement of the marker(s) on the line. Possible values are listed in the table below.
    *
    * Value  | Description
    * -------|---------------
    * begin  | Single marker at the start of the line
    * end    | Single marker at the end of the line
    * begin-end | Two markers, one at the start and one at the end of the line
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#placement)
    *
    * @default "begin-end"
    */
  var placement: js.UndefOr[begin | end | `begin-end`] = js.native
  /**
    * The marker style. Possible values are listed in the table below.
    *
    * Value  | Example
    * -------|--------
    * arrow  | ![lsm-arrow](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-arrow.png)
    * circle | ![lsm-circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-circle.png)
    * square | ![lsm-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-square.png)
    * diamond| ![lsm-diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-diamond.png)
    * cross  | ![lsm-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-cross.png)
    * x      | ![lsm-x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-lsm-x.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#style)
    *
    * @default "arrow"
    */
  var style: js.UndefOr[arrow | circle | square | diamond | cross | x] = js.native
}

object LineSymbolMarkerProperties {
  @scala.inline
  def apply(): LineSymbolMarkerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbolMarkerProperties]
  }
  @scala.inline
  implicit class LineSymbolMarkerPropertiesOps[Self <: LineSymbolMarkerProperties] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setPlacement(value: begin | end | `begin-end`): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setStyle(value: arrow | circle | square | diamond | cross | typings.arcgisJsApi.arcgisJsApiStrings.x): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

