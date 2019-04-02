package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Currently active sublayer. Defaults to the first sublayer in [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: js.UndefOr[WMTSSublayerProperties] = js.undefined
  /**
    * Copyright information for the WMTS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this to append different custom parameters to the WMTS tile requests. The custom layer parameters are applied to GetTile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * Use this to append custom parameters to all WMTS requests. The custom parameters are applied to GetCapabilities and GetTile. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * The service mode for the WMTS layer. If not specified, the API will first make a getCapabilities request using `RESTful`. If that fails, it will try using `KVP`.  **Possible Values:** RESTful | KVP
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    *
    * @default RESTful
    */
  var serviceMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMTSSublayerProperties]] = js.undefined
  /**
    * The URL of the WMTS service. The URL for the GetCapabilities is created based on the url and serviceMode properties. For example https://gibs.earthdata.nasa.gov/wmts/epsg4326/best.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use. Probably `1.0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WMTSLayerProperties {
  @scala.inline
  def apply(
    activeLayer: WMTSSublayerProperties = null,
    copyright: java.lang.String = null,
    customLayerParameters: js.Any = null,
    customParameters: js.Any = null,
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    portalItem: PortalItemProperties = null,
    refreshInterval: scala.Int | scala.Double = null,
    serviceMode: java.lang.String = null,
    sublayers: CollectionProperties[WMTSSublayerProperties] = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WMTSLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (activeLayer != null) __obj.updateDynamic("activeLayer")(activeLayer)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (customLayerParameters != null) __obj.updateDynamic("customLayerParameters")(customLayerParameters)
    if (customParameters != null) __obj.updateDynamic("customParameters")(customParameters)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (serviceMode != null) __obj.updateDynamic("serviceMode")(serviceMode)
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WMTSLayerProperties]
  }
}

