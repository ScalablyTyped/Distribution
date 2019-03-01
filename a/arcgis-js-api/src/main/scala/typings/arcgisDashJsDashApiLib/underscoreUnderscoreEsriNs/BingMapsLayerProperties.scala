package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsLayerProperties extends BaseTileLayerProperties {
  /**
    * Provides culture specific map labels. For more information visit: https://msdn.microsoft.com/en-us/library/ff701709.aspx  For a list of supported culture codes please visit: https://msdn.microsoft.com/en-us/library/hh441729.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#culture)
    *
    * @default "en-US"
    */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bing Maps Key.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#key)
    *
    * @default null
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This will alter Geopolitical disputed borders and labels to align with the specified user region.  For more information on Bing's region setting please visit: https://msdn.microsoft.com/en-us/library/ff701704.aspx  For a list of supported country codes please visit: see https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#region)
    *
    * @default null
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The three supported maps are: `road` | `aerial` | `hybrid`  For more information on Bing map styles please visit: https://msdn.microsoft.com/en-us/library/ff701716.aspx
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html#style)
    *
    * @default "road"
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object BingMapsLayerProperties {
  @scala.inline
  def apply(
    culture: java.lang.String = null,
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    key: java.lang.String = null,
    listMode: java.lang.String = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    refreshInterval: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    spatialReference: SpatialReferenceProperties = null,
    style: java.lang.String = null,
    tileInfo: TileInfoProperties = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BingMapsLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (key != null) __obj.updateDynamic("key")(key)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BingMapsLayerProperties]
  }
}

