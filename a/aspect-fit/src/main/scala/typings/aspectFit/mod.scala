package typings.aspectFit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(width: Double, height: Double, parentWidth: Double, parentHeight: Double): Output = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], parentWidth.asInstanceOf[js.Any], parentHeight.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  @JSImport("aspect-fit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Output extends StObject {
    
    var height: Double
    
    var scale: Double
    
    var width: Double
  }
  object Output {
    
    inline def apply(height: Double, scale: Double, width: Double): Output = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
