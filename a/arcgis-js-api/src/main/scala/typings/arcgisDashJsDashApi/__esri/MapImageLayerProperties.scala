package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bmp
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.gif
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.jpg
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.pdf
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png24
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.png8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.pngjpg
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.ArcGISMapServiceProperties because var conflicts: fullExtent. Inlined copyright, legendEnabled */ trait MapImageLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with TemporalLayerProperties {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * The output dots per inch (DPI) of the MapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[Double] = js.undefined
  /**
    * The version of the geodatabase of the map service data. Read the [Overview of versioning](https://desktop.arcgis.com/en/arcmap/latest/manage-data/geodatabases/an-overview-of-versioning.htm) topic for more details about this capability.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  /**
    * The output image type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageFormat)
    *
    * @default png24
    */
  var imageFormat: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg] = js.undefined
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The portal item from which the layer is loaded. This will load the layer along with any overridden properties (e.g. renderers, definition expressions, etc.) saved to the portal item, not the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#properties-summary) are exposed on the MapImageLayer class directly, this property gives access to all information returned by the map service. This property is useful if working in an application built using an older version of the API which requires access to map service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects that allow you to alter the properties of one or more sublayers of the MapImageLayer. If this property is not specified, all the sublayers from the service are displayed as defined in the service. If an empty array is passed to this property then none of the sublayers from the service are displayed in the layer.  All sublayers are referenced in the order in which they are drawn in the view (bottom to top). They may be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add), [removed](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#remove), or [reordered](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#reorder) using the [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) methods. Because [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) extends [Accessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html), its properties may be [watched](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#watching-for-property-changes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[SublayerProperties]] = js.undefined
  /**
    * The URL to the REST endpoint of the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object MapImageLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    dpi: Int | Double = null,
    fullExtent: ExtentProperties = null,
    gdbVersion: String = null,
    id: String = null,
    imageFormat: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg = null,
    imageMaxHeight: Int | Double = null,
    imageMaxWidth: Int | Double = null,
    imageTransparency: js.UndefOr[Boolean] = js.undefined,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    opacity: Int | Double = null,
    portalItem: PortalItemProperties = null,
    refreshInterval: Int | Double = null,
    sourceJSON: js.Any = null,
    sublayers: CollectionProperties[SublayerProperties] = null,
    timeInfo: TimeInfoProperties = null,
    title: String = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): MapImageLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat.asInstanceOf[js.Any])
    if (imageMaxHeight != null) __obj.updateDynamic("imageMaxHeight")(imageMaxHeight.asInstanceOf[js.Any])
    if (imageMaxWidth != null) __obj.updateDynamic("imageMaxWidth")(imageMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTransparency)) __obj.updateDynamic("imageTransparency")(imageTransparency)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON)
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (timeInfo != null) __obj.updateDynamic("timeInfo")(timeInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[MapImageLayerProperties]
  }
}

