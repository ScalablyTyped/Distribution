package typings.antvGBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Capture extends StObject {
    
    var capture: Boolean
    
    var visible: Boolean
    
    var zIndex: Double
  }
  object Capture {
    
    inline def apply(capture: Boolean, visible: Boolean, zIndex: Double): Capture = {
      val __obj = js.Dynamic.literal(capture = capture.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Capture]
    }
    
    extension [Self <: Capture](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientX extends StObject {
    
    var clientX: Double
    
    var clientY: Double
    
    var x: Double
    
    var y: Double
  }
  object ClientX {
    
    inline def apply(clientX: Double, clientY: Double, x: Double, y: Double): ClientX = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientX]
    }
    
    extension [Self <: ClientX](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(
      height: Double,
      maxX: Double,
      maxY: Double,
      minX: Double,
      minY: Double,
      width: Double,
      x: Double,
      y: Double
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Matrix extends StObject {
    
    var matrix: js.Any
    
    var opacity: Double
  }
  object Matrix {
    
    inline def apply(matrix: js.Any, opacity: Double): Matrix = {
      val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    extension [Self <: Matrix](x: Self) {
      
      inline def setMatrix(value: js.Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@antv/g-base.@antv/g-base/lib/types.BBox> */
  trait PartialBBox extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var maxX: js.UndefOr[Double] = js.undefined
    
    var maxY: js.UndefOr[Double] = js.undefined
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialBBox {
    
    inline def apply(): PartialBBox = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBBox]
    }
    
    extension [Self <: PartialBBox](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
