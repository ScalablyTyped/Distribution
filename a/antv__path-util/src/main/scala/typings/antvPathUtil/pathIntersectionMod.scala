package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathIntersectionMod {
  
  @JSImport("@antv/path-util/lib/path-intersection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(path1: js.Any, path2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait BoundPoint extends StObject {
    
    var max: Point
    
    var min: Point
  }
  object BoundPoint {
    
    @scala.inline
    def apply(max: Point, min: Point): BoundPoint = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundPoint]
    }
    
    @scala.inline
    implicit class BoundPointMutableBuilder[Self <: BoundPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Point): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Point): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
