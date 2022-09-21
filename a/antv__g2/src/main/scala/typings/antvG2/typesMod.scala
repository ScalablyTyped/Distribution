package typings.antvG2

import typings.antvG2.variableMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait Operator extends StObject
  @JSImport("@antv/g2/lib/chart/layout/constraint/types", "Operator")
  @js.native
  object Operator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Operator & String] = js.native
    
    @js.native
    sealed trait EQ
      extends StObject
         with Operator
    /* "eq" */ val EQ: typings.antvG2.typesMod.Operator.EQ & String = js.native
  }
  
  trait BoxObject extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object BoxObject {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): BoxObject = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxObject]
    }
    
    extension [Self <: BoxObject](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Element = Variable | Double | (js.Array[Variable | Double])
}
