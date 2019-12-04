package typings.atAngularCompiler

import typings.atAngularCompiler.atAngularCompilerStrings.DOLLARquotedDOLLAR
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/value_util", JSImport.Namespace)
@js.native
object srcOutputValueUnderscoreUtilMod extends js.Object {
  val QUOTED_KEYS: DOLLARquotedDOLLAR = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}

