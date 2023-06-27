package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.KVP
import typings.arcgisJsApi.arcgisJsApiStrings.RESTful
import typings.arcgisJsApi.arcgisJsApiStrings.wmts
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSLayer
  extends StObject
     with Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer
     with BlendLayer {
  
  /**
  		 * Currently active sublayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
  		 */
  var activeLayer: WMTSSublayer = js.native
  
  /**
  		 * Copyright information for the WMTS service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
  		 */
  var copyright: String = js.native
  
  /**
  		 * Use this to append different custom parameters to the WMTS tile requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
  		 */
  var customLayerParameters: Any = js.native
  
  /**
  		 * Use this to append custom parameters to all WMTS requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
  		 */
  var customParameters: Any = js.native
  
  /**
  		 * Requests a tile from the WMTS service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#fetchTile)
  		 */
  def fetchTile(level: Double, row: Double, col: Double): js.Promise[HTMLImageElement] = js.native
  def fetchTile(level: Double, row: Double, col: Double, options: WMTSLayerFetchTileOptions): js.Promise[HTMLImageElement] = js.native
  
  /**
  		 * Returns a [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) based on the given sublayer id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#findSublayerById)
  		 */
  def findSublayerById(id: String): WMTSSublayer = js.native
  
  /**
  		 * The service mode for the WMTS layer.
  		 *
  		 * @default RESTful
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
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
  		 * The URL of the WMTS service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
  		 */
  var url: String = js.native
  
  /**
  		 * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
  		 */
  var version: String = js.native
}
