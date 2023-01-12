package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CIMSymbolPropertiestypeci
import typings.arcgisJsApi.anon.PictureMarkerSymbolProper
import typings.arcgisJsApi.anon.PointSymbol3DPropertiesty
import typings.arcgisJsApi.anon.SimpleMarkerSymbolPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteStopSymbolsProperties extends StObject {
  
  /**
    * The default symbol for _break_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 255, 255], size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#break)
    */
  var break: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for the first [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [0, 255, 0], size: 20, outline: { color: [255, 255, 255], width: 4 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#first)
    */
  var first: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for a _last_ [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 0, 0], size: 20, outline: { color: [255, 255, 255], width: 4 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#last)
    */
  var last: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for _middle_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [51, 51, 51],, size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#middle)
    */
  var middle: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for an _unlocated_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 0, 0], size: 12, outline: { color: [255, 255, 255], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#unlocated)
    */
  var unlocated: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
  
  /**
    * The default symbol for _waypoint_ [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html#stops).
    *
    * @default { type: "simple-marker", color: [255, 255, 255], size: 12, outline: { color: [0, 122, 194], width: 3 } }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RouteStopSymbols.html#waypoint)
    */
  var waypoint: js.UndefOr[
    SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
  ] = js.undefined
}
object RouteStopSymbolsProperties {
  
  inline def apply(): RouteStopSymbolsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteStopSymbolsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteStopSymbolsProperties] (val x: Self) extends AnyVal {
    
    inline def setBreak(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
    
    inline def setBreakUndefined: Self = StObject.set(x, "break", js.undefined)
    
    inline def setFirst(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setLast(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setMiddle(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    inline def setUnlocated(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "unlocated", value.asInstanceOf[js.Any])
    
    inline def setUnlocatedUndefined: Self = StObject.set(x, "unlocated", js.undefined)
    
    inline def setWaypoint(
      value: SimpleMarkerSymbolPropert | PictureMarkerSymbolProper | PointSymbol3DPropertiesty | CIMSymbolPropertiestypeci
    ): Self = StObject.set(x, "waypoint", value.asInstanceOf[js.Any])
    
    inline def setWaypointUndefined: Self = StObject.set(x, "waypoint", js.undefined)
  }
}
