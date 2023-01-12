package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CIMSymbolPropertiestypeci
import typings.arcgisJsApi.anon.LineSymbol3DPropertiestyp
import typings.arcgisJsApi.anon.PictureFillSymbolProperti
import typings.arcgisJsApi.anon.PictureMarkerSymbolProper
import typings.arcgisJsApi.anon.PointSymbol3DPropertiesty
import typings.arcgisJsApi.anon.SimpleFillSymbolPropertie
import typings.arcgisJsApi.anon.SimpleLineSymbolPropertie
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSymbolsProperties extends StObject {
  
  /**
    * The default symbol for [direction lines](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#directionLines).
    *
    * @default { type: "simple-line", color: [0, 122, 194], width: 6 }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#directionLines)
    */
  var directionLines: js.UndefOr[
    SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for [direction points](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#directionPoints).
    *
    * @default { type: "simple-marker", color: [255, 255, 255], size: 6, outline: { color: [0, 122, 194], width: 2 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#directionPoints)
    */
  var directionPoints: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for [point barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#pointBarriers).
    *
    * @default { type: "simple-marker", style: "x", size: 10, outline: { color: [255, 0, 0], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for [polygon barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#polygonBarriers).
    *
    * @default { type: "simple-fill", color: [255, 170, 0, 0.6], outline: { width: 7.5, color: [255, 0, 0, 0.6] } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[
    PictureFillSymbolProperti | SimpleFillSymbolPropertie | typings.arcgisJsApi.anon.PolygonSymbol3DProperties | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for [polyline Barriers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#polylineBarriers).
    *
    * @default { type: "simple-line", color: [255, 85, 0, 0.7], width: 7.5 }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[
    SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for the overall [route](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#routeInfo).
    *
    * @default { type: "simple-line", color: [20, 89, 127], width: 8 }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#routeInfo)
    */
  var routeInfo: js.UndefOr[
    SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteSymbols.html#stops)
    */
  var stops: js.UndefOr[RouteStopSymbolsProperties] = js.undefined
}
object RouteSymbolsProperties {
  
  inline def apply(): RouteSymbolsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSymbolsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteSymbolsProperties] (val x: Self) extends AnyVal {
    
    inline def setDirectionLines(value: SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci): Self = StObject.set(x, "directionLines", value.asInstanceOf[js.Any])
    
    inline def setDirectionLinesUndefined: Self = StObject.set(x, "directionLines", js.undefined)
    
    inline def setDirectionPoints(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "directionPoints", value.asInstanceOf[js.Any])
    
    inline def setDirectionPointsUndefined: Self = StObject.set(x, "directionPoints", js.undefined)
    
    inline def setPointBarriers(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPolygonBarriers(
      value: PictureFillSymbolProperti | SimpleFillSymbolPropertie | typings.arcgisJsApi.anon.PolygonSymbol3DProperties | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolylineBarriers(value: SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setRouteInfo(value: SimpleLineSymbolPropertie | LineSymbol3DPropertiestyp | CIMSymbolPropertiestypeci): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
    
    inline def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
    
    inline def setStops(value: RouteStopSymbolsProperties): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
