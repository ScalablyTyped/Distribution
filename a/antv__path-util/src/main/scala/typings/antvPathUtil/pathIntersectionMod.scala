package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathIntersectionMod {
  
  @JSImport("@antv/path-util/lib/path-intersection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path1: Any, path2: Any): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  trait BoundPoint extends StObject {
    
    var max: Point
    
    var min: Point
  }
  object BoundPoint {
    
    inline def apply(max: Point, min: Point): BoundPoint = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundPoint]
    }
    
    extension [Self <: BoundPoint](x: Self) {
      
      inline def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
