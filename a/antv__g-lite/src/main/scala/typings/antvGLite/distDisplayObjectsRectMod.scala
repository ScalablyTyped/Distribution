package typings.antvGLite

import typings.antvGLite.distCssParserTransformMod.ParsedTransform
import typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsRectMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/Rect", "Rect")
  @js.native
  open class Rect () extends DisplayObject[RectStyleProps, ParsedRectStyleProps] {
    def this(param0: DisplayObjectConfig[RectStyleProps]) = this()
  }
  
  trait ParsedRectStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    var height: Double
    
    var radius: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ParsedRectStyleProps {
    
    inline def apply(height: Double, transform: js.Array[ParsedTransform], width: Double, x: Double, y: Double): ParsedRectStyleProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRectStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedRectStyleProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait RectStyleProps
    extends StObject
       with BaseStyleProps {
    
    var height: Double | String
    
    /**
      * top-left, top-right, bottom-right, bottom-left
      */
    var radius: js.UndefOr[Double | String | js.Array[Double]] = js.undefined
    
    var width: Double | String
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object RectStyleProps {
    
    inline def apply(height: Double | String, width: Double | String): RectStyleProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectStyleProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double | String | js.Array[Double]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRadiusVarargs(value: Double*): Self = StObject.set(x, "radius", js.Array(value*))
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
