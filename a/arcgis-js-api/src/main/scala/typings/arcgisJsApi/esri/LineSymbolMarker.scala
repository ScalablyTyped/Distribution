package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`begin-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-marker`
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
trait LineSymbolMarker extends Accessor {
  /**
    * The color of the marker. If not specified, the marker will match the color of the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#color)
    */
  var color: Color_ = js.native
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
  var placement: begin | end | `begin-end` = js.native
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
  var style: arrow | circle | square | diamond | cross | x = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html#type)
    */
  val `type`: `line-marker` = js.native
}

