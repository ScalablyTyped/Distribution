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
    
    @scala.inline
    def apply(max: Double, min: Double, ticks: js.Array[Double]): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
  
  trait Min extends StObject {
    
    var max: Double
    
    var min: Double
    
    var ticks: js.Array[js.Any]
  }
  object Min {
    
    @scala.inline
    def apply(max: Double, min: Double, ticks: js.Array[js.Any]): Min = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    @scala.inline
    implicit class MinMutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
  
  trait Ticks extends StObject {
    
    var max: Double
    
    var min: Double
    
    var ticks: js.Array[js.Any]
  }
  object Ticks {
    
    @scala.inline
    def apply(max: Double, min: Double, ticks: js.Array[js.Any]): Ticks = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ticks]
    }
    
    @scala.inline
    implicit class TicksMutableBuilder[Self <: Ticks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicks(value: js.Array[js.Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    }
  }
}
