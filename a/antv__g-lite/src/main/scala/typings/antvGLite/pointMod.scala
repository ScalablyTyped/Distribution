package typings.antvGLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("@antv/g-lite/dist/shapes/Point", "Point")
  @js.native
  open class Point () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    def copyFrom(p: Point): Unit = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  trait PointLike extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object PointLike {
    
    inline def apply(x: Double, y: Double): PointLike = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointLike]
    }
    
    extension [Self <: PointLike](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
