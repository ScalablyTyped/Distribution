package typings.amapJsApi.anon

import typings.amapJsApi.AMap.Bounds
import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.Map
import typings.amapJsApi.AMap.StrokeLineCap
import typings.amapJsApi.AMap.StrokeLineJoin
import typings.amapJsApi.AMap.StrokeStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<amap-js-api.AMap.Rectangle.Options<any>> */
trait PartialOptionsany extends StObject {
  
  var bounds: js.UndefOr[Bounds] = js.undefined
  
  var bubble: js.UndefOr[Boolean] = js.undefined
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var extData: js.UndefOr[js.Any] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var lineCap: js.UndefOr[StrokeLineCap] = js.undefined
  
  var lineJoin: js.UndefOr[StrokeLineJoin] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var path: js.UndefOr[js.Array[js.Array[LocationValue] | LocationValue]] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeDasharray: js.UndefOr[js.Array[Double]] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeStyle: js.UndefOr[StrokeStyle] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PartialOptionsany {
  
  inline def apply(): PartialOptionsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsany]
  }
  
  extension [Self <: PartialOptionsany](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBubble(value: Boolean): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setExtData(value: js.Any): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
    
    inline def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLineCap(value: StrokeLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineJoin(value: StrokeLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPath(value: js.Array[js.Array[LocationValue] | LocationValue]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (js.Array[LocationValue] | LocationValue)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeDasharray(value: js.Array[Double]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDasharrayVarargs(value: Double*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStyle(value: StrokeStyle): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
