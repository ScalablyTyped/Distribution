package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.LiteralMapExpr
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render3UtilMod {
  
  @JSImport("@angular/compiler/src/render3/util", "convertMetaToOutput")
  @js.native
  def convertMetaToOutput(meta: js.Any, ctx: OutputContext): Expression = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "getSyntheticPropertyName")
  @js.native
  def getSyntheticPropertyName(name: String): String = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "isSyntheticPropertyOrListener")
  @js.native
  def isSyntheticPropertyOrListener(name: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "jitOnlyGuardedExpression")
  @js.native
  def jitOnlyGuardedExpression(expr: Expression): Expression = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "mapToMapExpression")
  @js.native
  def mapToMapExpression(map: StringDictionary[js.UndefOr[Expression]]): LiteralMapExpr = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "prepareSyntheticListenerFunctionName")
  @js.native
  def prepareSyntheticListenerFunctionName(name: String, phase: String): String = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "prepareSyntheticListenerName")
  @js.native
  def prepareSyntheticListenerName(name: String, phase: String): String = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "prepareSyntheticPropertyName")
  @js.native
  def prepareSyntheticPropertyName(name: String): String = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "typeWithParameters")
  @js.native
  def typeWithParameters(`type`: Expression, numParams: Double): ExpressionType_ = js.native
  
  @JSImport("@angular/compiler/src/render3/util", "wrapReference")
  @js.native
  def wrapReference(value: js.Any): R3Reference = js.native
  
  @js.native
  trait R3Reference extends StObject {
    
    var `type`: Expression = js.native
    
    var value: Expression = js.native
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
