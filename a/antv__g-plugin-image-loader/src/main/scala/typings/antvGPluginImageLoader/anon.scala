package typings.antvGPluginImageLoader

import typings.antvGLite.cssgradientvalueMod.GradientType
import typings.antvGPluginImageLoader.imagePoolMod.GradientParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @antv/g-lite.@antv/g-lite.LinearGradient & {  width :number,   height :number,   type :@antv/g-lite.@antv/g-lite.GradientType} */
  trait LinearGradientwidthnumber
    extends StObject
       with GradientParams {
    
    var angle: Double
    
    var hash: String
    
    var height: Double
    
    var steps: js.Array[js.Tuple2[Double, String]]
    
    var `type`: GradientType
    
    var width: Double
  }
  object LinearGradientwidthnumber {
    
    inline def apply(
      angle: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): LinearGradientwidthnumber = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientwidthnumber]
    }
    
    extension [Self <: LinearGradientwidthnumber](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setType(value: GradientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @antv/g-lite.@antv/g-lite.RadialGradient & {  width :number,   height :number,   type :@antv/g-lite.@antv/g-lite.GradientType} */
  trait RadialGradientwidthnumber
    extends StObject
       with GradientParams {
    
    var cx: Double
    
    var cy: Double
    
    var hash: String
    
    var height: Double
    
    var steps: js.Array[js.Tuple2[Double, String]]
    
    var `type`: GradientType
    
    var width: Double
  }
  object RadialGradientwidthnumber {
    
    inline def apply(
      cx: Double,
      cy: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): RadialGradientwidthnumber = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGradientwidthnumber]
    }
    
    extension [Self <: RadialGradientwidthnumber](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setType(value: GradientType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
