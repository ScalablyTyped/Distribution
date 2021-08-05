package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marker extends StObject {
  
  /**
    * 该图例项 marker 的填充颜色
    */
  var fill: String
  
  var marker: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * 图例项的文本内容
    */
  var value: String
}
object Marker {
  
  inline def apply(fill: String, value: String): Marker = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  extension [Self <: Marker](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String | js.Function): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
