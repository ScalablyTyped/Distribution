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
  
  @scala.inline
  def convertMetaToOutput(meta: js.Any, ctx: OutputContext): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertMetaToOutput")(meta.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  @scala.inline
  def getSyntheticPropertyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyntheticPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isSyntheticPropertyOrListener(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticPropertyOrListener")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def jitOnlyGuardedExpression(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("jitOnlyGuardedExpression")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  @scala.inline
  def mapToMapExpression(map: StringDictionary[js.UndefOr[Expression]]): LiteralMapExpr = ^.asInstanceOf[js.Dynamic].applyDynamic("mapToMapExpression")(map.asInstanceOf[js.Any]).asInstanceOf[LiteralMapExpr]
  
  @scala.inline
  def prepareSyntheticListenerFunctionName(name: String, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticListenerFunctionName")(name.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def prepareSyntheticListenerName(name: String, phase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticListenerName")(name.asInstanceOf[js.Any], phase.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def prepareSyntheticPropertyName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSyntheticPropertyName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def typeWithParameters(`type`: Expression, numParams: Double): ExpressionType_ = (^.asInstanceOf[js.Dynamic].applyDynamic("typeWithParameters")(`type`.asInstanceOf[js.Any], numParams.asInstanceOf[js.Any])).asInstanceOf[ExpressionType_]
  
  @scala.inline
  def wrapReference(value: js.Any): R3Reference = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapReference")(value.asInstanceOf[js.Any]).asInstanceOf[R3Reference]
  
  trait R3Reference extends StObject {
    
    var `type`: Expression
    
    var value: Expression
  }
  object R3Reference {
    
    @scala.inline
    def apply(`type`: Expression, value: Expression): R3Reference = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3Reference]
    }
    
    @scala.inline
    implicit class R3ReferenceMutableBuilder[Self <: R3Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
