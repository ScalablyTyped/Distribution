package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  val bingLogo: java.lang.String = js.native
  /**
    * Copyright information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#copyright)
    */
  val copyright: java.lang.String = js.native
  /**
    * Provides culture specific map labels. For more information visit: https://msdn.microsoft.com/en-us/library/ff701709.aspx  For a list of supported culture codes please visit: https://msdn.microsoft.com/en-us/library/hh441729.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    *
    * @default "en-US"
    */
  var culture: java.lang.String = js.native
  /**
    * Indicates if the layer has attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#hasAttributionData)
    */
  val hasAttributionData: scala.Boolean = js.native
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    *
    * @default null
    */
  var key: java.lang.String = js.native
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.  For more information on Bing's region setting please visit: https://msdn.microsoft.com/en-us/library/ff701704.aspx  For a list of supported country codes please visit: see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    *
    * @default null
    */
  var region: java.lang.String = js.native
  /**
    * The three supported maps are: `road` | `aerial` | `hybrid`  For more information on Bing map styles please visit: https://msdn.microsoft.com/en-us/library/ff701716.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    *
    * @default "road"
    */
  var style: java.lang.String = js.native
}

@JSGlobal("__esri.BingMapsLayer")
@js.native
/**
  * This layer supports Microsoft's Bing tiled map content. Three map styles are supported - `road`, `aerial` and `hybrid`. Please note that a valid [Bing Maps key](https://msdn.microsoft.com/en-us/library/ff428642.aspx) is required to use this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html)
  */
class BingMapsLayerCls () extends BingMapsLayer {
  def this(properties: BingMapsLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}

