package typings
package atAngularCompilerLib.srcRender3UtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/util", JSImport.Namespace)
@js.native
object srcRender3UtilModMembers extends js.Object {
  def convertMetaToOutput(meta: js.Any, ctx: atAngularCompilerLib.srcUtilMod.OutputContext): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def getSyntheticPropertyName(name: java.lang.String): java.lang.String = js.native
  def isSyntheticPropertyOrListener(name: java.lang.String): scala.Boolean = js.native
  def mapToMapExpression(
    map: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.LiteralMapExpr = js.native
  def prepareSyntheticListenerFunctionName(name: java.lang.String, phase: java.lang.String): java.lang.String = js.native
  def prepareSyntheticListenerName(name: java.lang.String, phase: java.lang.String): java.lang.String = js.native
  def prepareSyntheticPropertyName(name: java.lang.String): java.lang.String = js.native
  def typeWithParameters(`type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression, numParams: scala.Double): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExpressionType = js.native
}

