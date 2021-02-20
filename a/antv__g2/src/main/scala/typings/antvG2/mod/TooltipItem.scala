package typings.antvG2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipItem extends StObject {
  
  var color: String = js.native
  
  var marker: js.Any = js.native
  
  var name: String = js.native
  
  var point: js.Any = js.native
  
  var showMarker: Boolean = js.native
  
  var title: String = js.native
  
  var value: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object TooltipItem {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TooltipItemMutableBuilder[Self <: TooltipItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: js.Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: js.Any): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
