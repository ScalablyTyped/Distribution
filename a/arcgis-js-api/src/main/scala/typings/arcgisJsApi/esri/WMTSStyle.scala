package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSStyle
  extends Accessor
     with JSONSupport {
  /**
    * Description for the WMTS style. This defaults to the value of the Abstract property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#description)
    */
  var description: String = js.native
  /**
    * The unique ID assigned to the style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#id)
    */
  var id: String = js.native
  /**
    * The URL to the legend which gets used in [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget. This defaults to the value of the LegendURL property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#legendUrl)
    */
  var legendUrl: String = js.native
  /**
    * The title of the WMTS style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#title)
    */
  var title: String = js.native
}

