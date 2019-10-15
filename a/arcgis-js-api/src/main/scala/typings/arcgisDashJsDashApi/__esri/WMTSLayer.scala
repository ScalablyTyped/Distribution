package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.KVP
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.RESTful
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.wmts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * Currently active sublayer. Defaults to the first sublayer in [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: WMTSSublayer = js.native
  /**
    * Copyright information for the WMTS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: String = js.native
  /**
    * Use this to append different custom parameters to the WMTS tile requests. The custom layer parameters are applied to GetTile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.Any = js.native
  /**
    * Use this to append custom parameters to all WMTS requests. The custom parameters are applied to GetCapabilities and GetTile. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.Any = js.native
  /**
    * The service mode for the WMTS layer. If not specified, the API will first make a getCapabilities request using `RESTful`. If that fails, it will try using `KVP`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    *
    * @default RESTful
    */
  var serviceMode: RESTful | KVP = js.native
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: Collection[WMTSSublayer] = js.native
  @JSName("type")
  val type_WMTSLayer: wmts = js.native
  /**
    * The URL of the WMTS service. The URL for the GetCapabilities is created based on the url and serviceMode properties. For example https://gibs.earthdata.nasa.gov/wmts/epsg4326/best.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: String = js.native
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use. Probably `1.0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: String = js.native
  /**
    * Returns a [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) based on the given sublayer id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id) of the WMTS sublayer.
    *
    */
  def findSublayerById(id: String): WMTSSublayer = js.native
}

@JSGlobal("__esri.WMTSLayer")
@js.native
object WMTSLayer extends TopLevel[WMTSLayerConstructor]

