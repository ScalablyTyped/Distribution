package typings.antvG2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipItem extends StObject {
  
  var color: String
  
  var marker: js.Any
  
  var name: String
  
  var point: js.Any
  
  var showMarker: Boolean
  
  var title: String
  
  var value: String
  
  var x: Double
  
  var y: Double
}
object TooltipItem {
  
  inline def apply(
    color: String,
    marker: js.Any,
    name: String,
    point: js.Any,
    showMarker: Boolean,
    title: String,
    value: String,
    x: Double,
    y: Double
  ): TooltipItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], showMarker = showMarker.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipItem]
  }
  
  extension [Self <: TooltipItem](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: js.Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: js.Any): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
