package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.LiteralMapExpr
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render3UtilMod {
  
  @JSImport("@angular/compiler/src/render3/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertMetaToOutput(meta: js.Any, ctx: OutputContext): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMetaToOutput")(meta.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def getSyntheticPropertyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyntheticPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isSyntheticPropertyOrListener(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticPropertyOrListener")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jitOnlyGuardedExpression(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("jitOnlyGuardedExpression")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def mapToMapExpression(map: StringDictionary[js.UndefOr[Expression]]): LiteralMapExpr = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToMapExpression")(map.asInstanceOf[js.Any]).asInstanceOf[LiteralMapExpr]
  
  inline def prepareSyntheticListenerFunctionName(name: String, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticListenerFunctionName")(name.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def prepareSyntheticListenerName(name: String, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticListenerName")(name.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def prepareSyntheticPropertyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def typeWithParameters(`type`: Expression, numParams: Double): ExpressionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeWithParameters")(`type`.asInstanceOf[js.Any], numParams.asInstanceOf[js.Any])).asInstanceOf[ExpressionType_]
  
  inline def wrapReference(value: js.Any): R3Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapReference")(value.asInstanceOf[js.Any]).asInstanceOf[R3Reference]
  
  trait R3Reference extends StObject {
    
    var `type`: Expression
    
    var value: Expression
  }
  object R3Reference {
    
    inline def apply(`type`: Expression, value: Expression): R3Reference = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3Reference]
    }
    
    extension [Self <: R3Reference](x: Self) {
      
      inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
