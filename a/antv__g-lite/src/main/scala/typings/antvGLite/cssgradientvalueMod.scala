package typings.antvGLite

import typings.antvGLite.cssstylevalueMod.CSSStyleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssgradientvalueMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSGradientValue", "CSSGradientValue")
  @js.native
  open class CSSGradientValue protected () extends CSSStyleValue {
    def this(`type`: GradientType, value: LinearGradient) = this()
    def this(`type`: GradientType, value: RadialGradient) = this()
    
    var `type`: GradientType = js.native
    
    var value: LinearGradient | RadialGradient = js.native
  }
  
  @js.native
  sealed trait GradientType extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSGradientValue", "GradientType")
  @js.native
  object GradientType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GradientType & Double] = js.native
    
    @js.native
    sealed trait Constant
      extends StObject
         with GradientType
    /* 0 */ val Constant: typings.antvGLite.cssgradientvalueMod.GradientType.Constant & Double = js.native
    
    @js.native
    sealed trait LinearGradient
      extends StObject
         with GradientType
    /* 1 */ val LinearGradient: typings.antvGLite.cssgradientvalueMod.GradientType.LinearGradient & Double = js.native
    
    @js.native
    sealed trait RadialGradient
      extends StObject
         with GradientType
    /* 2 */ val RadialGradient: typings.antvGLite.cssgradientvalueMod.GradientType.RadialGradient & Double = js.native
  }
  
  trait LinearGradient extends StObject {
    
    var angle: Double
    
    var hash: String
    
    var steps: js.Array[js.Tuple2[Double, String]]
  }
  object LinearGradient {
    
    inline def apply(angle: Double, hash: String, steps: js.Array[js.Tuple2[Double, String]]): LinearGradient = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradient]
    }
    
    extension [Self <: LinearGradient](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait RadialGradient extends StObject {
    
    var cx: Double
    
    var cy: Double
    
    var hash: String
    
    var steps: js.Array[js.Tuple2[Double, String]]
  }
  object RadialGradient {
    
    inline def apply(cx: Double, cy: Double, hash: String, steps: js.Array[js.Tuple2[Double, String]]): RadialGradient = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGradient]
    }
    
    extension [Self <: RadialGradient](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
}
