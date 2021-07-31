package typings.antvGMath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxX extends StObject {
    
    var maxX: js.Any
    
    var maxY: js.Any
    
    var minX: js.Any
    
    var minY: js.Any
  }
  object MaxX {
    
    @scala.inline
    def apply(maxX: js.Any, maxY: js.Any, minX: js.Any, minY: js.Any): MaxX = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxX]
    }
    
    @scala.inline
    implicit class MaxXMutableBuilder[Self <: MaxX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxX(value: js.Any): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxY(value: js.Any): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinX(value: js.Any): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinY(value: js.Any): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
