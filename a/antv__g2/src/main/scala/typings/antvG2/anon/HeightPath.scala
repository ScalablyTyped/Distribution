package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightPath extends StObject {
  
  var height: Unit
  
  var path: js.Array[js.Array[String | Double]]
  
  var width: Unit
  
  var x: Unit
  
  var y: Unit
}
object HeightPath {
  
  inline def apply(height: Unit, path: js.Array[js.Array[String | Double]], width: Unit, x: Unit, y: Unit): HeightPath = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPath]
  }
  
  extension [Self <: HeightPath](x: Self) {
    
    inline def setHeight(value: Unit): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setWidth(value: Unit): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Unit): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Unit): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
