package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSymbols
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The default symbol for [direction lines](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#directionLines).
  		 *
  		 * @default { type: "simple-line", color: [0, 122, 194], width: 6 }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#directionLines)
  		 */
  var directionLines: SimpleLineSymbol | LineSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for [direction points](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#directionPoints).
  		 *
  		 * @default { type: "simple-marker", color: [255, 255, 255], size: 6, outline: { color: [0, 122, 194], width: 2 } }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#directionPoints)
  		 */
  var directionPoints: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#pointBarriers).
  		 *
  		 * @default { type: "simple-marker", style: "x", size: 10, outline: { color: [255, 0, 0], width: 3 } }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#pointBarriers)
  		 */
  var pointBarriers: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#polygonBarriers).
  		 *
  		 * @default { type: "simple-fill", color: [255, 170, 0, 0.6], outline: { width: 7.5, color: [255, 0, 0, 0.6] } }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#polygonBarriers)
  		 */
  var polygonBarriers: PictureFillSymbol | SimpleFillSymbol | PolygonSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for [polyline Barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#polylineBarriers).
  		 *
  		 * @default { type: "simple-line", color: [255, 85, 0, 0.7], width: 7.5 }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#polylineBarriers)
  		 */
  var polylineBarriers: SimpleLineSymbol | LineSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for the overall [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#routeInfo).
  		 *
  		 * @default { type: "simple-line", color: [20, 89, 127], width: 8 }
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#routeInfo)
  		 */
  var routeInfo: SimpleLineSymbol | LineSymbol3D | CIMSymbol = js.native
  
  /**
  		 * The default symbol for [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#stops)
  		 */
  var stops: RouteStopSymbols = js.native
}
