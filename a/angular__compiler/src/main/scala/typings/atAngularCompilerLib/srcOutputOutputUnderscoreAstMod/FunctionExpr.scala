package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "FunctionExpr")
@js.native
class FunctionExpr protected () extends Expression {
  def this(params: js.Array[FnParam], statements: js.Array[Statement]) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, name: java.lang.String) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, sourceSpan: scala.Null, name: java.lang.String) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, name: java.lang.String) = this()
  def this(params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, sourceSpan: scala.Null, name: java.lang.String) = this()
  var name: js.UndefOr[java.lang.String | scala.Null] = js.native
  var params: js.Array[FnParam] = js.native
  var statements: js.Array[Statement] = js.native
  def toDeclStmt(name: java.lang.String): DeclareFunctionStmt = js.native
  def toDeclStmt(name: java.lang.String, modifiers: js.Array[StmtModifier]): DeclareFunctionStmt = js.native
}

