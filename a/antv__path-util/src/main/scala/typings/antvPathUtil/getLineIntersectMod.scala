package typings.antvPathUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLineIntersectMod {
  
  @JSImport("@antv/path-util/lib/get-line-intersect", JSImport.Default)
  @js.native
  def default(p0: Point, p1: Point, p2: Point, p3: Point): Point | Null = js.native
  
  @js.native
  trait Point extends StObject {
    
    /**
      * x 值
      * @type {number}
      */
    var x: Double = js.native
    
    /**
      * y 值
      * @type {number}
      */
    var y: Double = js.native
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
