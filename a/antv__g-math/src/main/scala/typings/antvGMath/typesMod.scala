package typings.antvGMath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait BBox extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object BBox {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): BBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit class BBoxMutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
  
  type PointTuple = js.Tuple2[Double, Double]
  
  trait Segment extends StObject {
    
    var from: PointTuple
    
    var length: Double
    
    var to: PointTuple
  }
  object Segment {
    
    @scala.inline
    def apply(from: PointTuple, length: Double, to: PointTuple): Segment = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: PointTuple): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: PointTuple): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
