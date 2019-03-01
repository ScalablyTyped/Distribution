package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties {
  /**
    * The portal item from which the layer is loaded. This will load the layer from the portal item, not the vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * A style JSON object of vector tiles that will be used to render the layer. If initializing the layer with a style JSON object, the tiles are fetched from the tile servers specified in the style object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#style)
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  /**
    * The URL to the vector tile service, or the URL to the style resource of vector tiles that will be used to render the layer. If specifying a URL to a style, the tiles are fetched from the tile servers specified in the style object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object VectorTileLayerProperties {
  @scala.inline
  def apply(
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    listMode: java.lang.String = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    portalItem: PortalItemProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    style: js.Any = null,
    tileInfo: TileInfoProperties = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): VectorTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[VectorTileLayerProperties]
  }
}

