package typings.antvGLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssmathoperatorMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSMathOperator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CSSMathOperator extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSMathOperator", "CSSMathOperator")
  @js.native
  object CSSMathOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CSSMathOperator & String] = js.native
    
    @js.native
    sealed trait kAdd
      extends StObject
         with CSSMathOperator
    /* "+" */ val kAdd: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kAdd & String = js.native
    
    @js.native
    sealed trait kClamp
      extends StObject
         with CSSMathOperator
    /* "clamp" */ val kClamp: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kClamp & String = js.native
    
    @js.native
    sealed trait kDivide
      extends StObject
         with CSSMathOperator
    /* "/" */ val kDivide: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kDivide & String = js.native
    
    @js.native
    sealed trait kInvalid
      extends StObject
         with CSSMathOperator
    /* "" */ val kInvalid: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kInvalid & String = js.native
    
    @js.native
    sealed trait kMax
      extends StObject
         with CSSMathOperator
    /* "max" */ val kMax: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kMax & String = js.native
    
    @js.native
    sealed trait kMin
      extends StObject
         with CSSMathOperator
    /* "min" */ val kMin: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kMin & String = js.native
    
    @js.native
    sealed trait kMultiply
      extends StObject
         with CSSMathOperator
    /* "*" */ val kMultiply: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kMultiply & String = js.native
    
    @js.native
    sealed trait kSubtract
      extends StObject
         with CSSMathOperator
    /* "-" */ val kSubtract: typings.antvGLite.cssmathoperatorMod.CSSMathOperator.kSubtract & String = js.native
  }
  
  inline def isComparison(op: CSSMathOperator): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComparison")(op.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
