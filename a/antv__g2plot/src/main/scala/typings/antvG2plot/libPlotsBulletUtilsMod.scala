package typings.antvG2plot

import typings.antvG2plot.libPlotsBulletTypesMod.BulletOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBulletUtilsMod {
  
  @JSImport("@antv/g2plot/lib/plots/bullet/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformData(options: BulletOptions): TransformData_ = ^.asInstanceOf[js.Dynamic].applyDynamic("transformData")(options.asInstanceOf[js.Any]).asInstanceOf[TransformData_]
  
  trait TransformData_ extends StObject {
    
    var ds: js.Array[Any]
    
    var max: Double
    
    var min: Double
  }
  object TransformData_ {
    
    inline def apply(ds: js.Array[Any], max: Double, min: Double): TransformData_ = {
      val __obj = js.Dynamic.literal(ds = ds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformData_]
    }
    
    extension [Self <: TransformData_](x: Self) {
      
      inline def setDs(value: js.Array[Any]): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
      
      inline def setDsVarargs(value: Any*): Self = StObject.set(x, "ds", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
