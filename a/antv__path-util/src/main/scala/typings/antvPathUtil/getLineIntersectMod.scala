package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLineIntersectMod {
  
  @JSImport("@antv/path-util/lib/get-line-intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
  
  trait Point extends StObject {
    
    /**
      * x 值
      * @type {number}
      */
    var x: Double
    
    /**
      * y 值
      * @type {number}
      */
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
