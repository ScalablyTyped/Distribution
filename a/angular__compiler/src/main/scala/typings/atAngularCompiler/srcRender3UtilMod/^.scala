package typings.atAngularCompiler.srcRender3UtilMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExpressionType
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertMetaToOutput(meta: js.Any, ctx: OutputContext): Expression = js.native
  def getSyntheticPropertyName(name: String): String = js.native
  def isSyntheticPropertyOrListener(name: String): Boolean = js.native
  def mapToMapExpression(map: StringDictionary[Expression]): LiteralMapExpr = js.native
  def prepareSyntheticListenerFunctionName(name: String, phase: String): String = js.native
  def prepareSyntheticListenerName(name: String, phase: String): String = js.native
  def prepareSyntheticPropertyName(name: String): String = js.native
  def typeWithParameters(`type`: Expression, numParams: Double): ExpressionType = js.native
}

