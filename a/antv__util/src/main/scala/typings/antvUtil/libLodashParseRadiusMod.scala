package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashParseRadiusMod {
  
  @JSImport("@antv/util/lib/lodash/parse-radius", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(radius: js.Array[Double]): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  inline def default(radius: Double): RadiusType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(radius.asInstanceOf[js.Any]).asInstanceOf[RadiusType]
  
  trait RadiusType extends StObject {
    
    var r1: Double
    
    var r2: Double
    
    var r3: Double
    
    var r4: Double
  }
  object RadiusType {
    
    inline def apply(r1: Double, r2: Double, r3: Double, r4: Double): RadiusType = {
      val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], r3 = r3.asInstanceOf[js.Any], r4 = r4.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadiusType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadiusType] (val x: Self) extends AnyVal {
      
      inline def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
      
      inline def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      
      inline def setR3(value: Double): Self = StObject.set(x, "r3", value.asInstanceOf[js.Any])
      
      inline def setR4(value: Double): Self = StObject.set(x, "r4", value.asInstanceOf[js.Any])
    }
  }
}
