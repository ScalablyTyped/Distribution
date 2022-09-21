package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportingWidgetDefaultsSketch
  extends StObject
     with Object {
  
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.undefined
  
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.undefined
  
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.undefined
}
object SupportingWidgetDefaultsSketch {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
  
  extension [Self <: SupportingWidgetDefaultsSketch](x: Self) {
    
    inline def setDefaultUpdateOptions(value: Any): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    inline def setMarkerSymbol(value: SimpleMarkerSymbol): Self = StObject.set(x, "markerSymbol", value.asInstanceOf[js.Any])
    
    inline def setMarkerSymbolUndefined: Self = StObject.set(x, "markerSymbol", js.undefined)
    
    inline def setPolygonSymbol(value: SimpleFillSymbol): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    inline def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    inline def setPolylineSymbol(value: SimpleLineSymbol): Self = StObject.set(x, "polylineSymbol", value.asInstanceOf[js.Any])
    
    inline def setPolylineSymbolUndefined: Self = StObject.set(x, "polylineSymbol", js.undefined)
  }
}
