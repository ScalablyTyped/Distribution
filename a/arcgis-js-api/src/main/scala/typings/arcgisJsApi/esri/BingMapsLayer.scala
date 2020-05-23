package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMapsLayer extends BaseTileLayer {
  /**
    * Expose Bing logo url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#bingLogo)
    */
  val bingLogo: String = js.native
  /**
    * Copyright information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#copyright)
    */
  val copyright: String = js.native
  /**
    * Provides culture specific map labels. For more information visit: https://msdn.microsoft.com/en-us/library/ff701709.aspx  For a list of supported culture codes please visit: https://msdn.microsoft.com/en-us/library/hh441729.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    *
    * @default "en-US"
    */
  var culture: String = js.native
  /**
    * Indicates if the layer has attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#hasAttributionData)
    */
  val hasAttributionData: Boolean = js.native
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    *
    * @default null
    */
  var key: String = js.native
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.  For more information on Bing's region setting please visit: https://msdn.microsoft.com/en-us/library/ff701704.aspx  For a list of supported country codes please visit: see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    *
    * @default null
    */
  var region: String = js.native
  /**
    * The three supported maps are: `road` | `aerial` | `hybrid`  For more information on Bing map styles please visit: https://msdn.microsoft.com/en-us/library/ff701716.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    *
    * @default "road"
    */
  var style: String = js.native
  @JSName("type")
  val type_BingMapsLayer: `bing-maps` = js.native
}

