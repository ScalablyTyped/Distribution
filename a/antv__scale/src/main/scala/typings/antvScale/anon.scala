package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
    
    var ticks: js.Array[Double]
  }
  object Max {
    
    inline def apply(max: Double, min: Double, ticks: js.Array[Double]): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
  
  trait Min extends StObject {
    
    var max: Double
    
    var min: Double
    
    var ticks: js.Array[js.Any]
  }
  object Min {
    
    inline def apply(max: Double, min: Double, ticks: js.Array[js.Any]): Min = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    extension [Self <: Min](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
  
  trait Ticks extends StObject {
    
    var max: Double
    
    var min: Double
    
    var ticks: js.Array[js.Any]
  }
  object Ticks {
    
    inline def apply(max: Double, min: Double, ticks: js.Array[js.Any]): Ticks = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ticks]
    }
    
    extension [Self <: Ticks](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
}
