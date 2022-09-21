package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteStopSymbols
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The default symbol for _break_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 255, 255], size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#break)
    */
  var break: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
    * The default symbol for the first [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [0, 255, 0], size: 20, outline: { color: [255, 255, 255], width: 4 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#first)
    */
  var first: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
    * The default symbol for a _last_ [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 0, 0], size: 20, outline: { color: [255, 255, 255], width: 4 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#last)
    */
  var last: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
    * The default symbol for _middle_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [51, 51, 51],, size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#middle)
    */
  var middle: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
    * The default symbol for an _unlocated_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 0, 0], size: 12, outline: { color: [255, 255, 255], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#unlocated)
    */
  var unlocated: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
  
  /**
    * The default symbol for _waypoint_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 255, 255], size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#waypoint)
    */
  var waypoint: SimpleMarkerSymbol | PictureMarkerSymbol | PointSymbol3D | CIMSymbol = js.native
}
