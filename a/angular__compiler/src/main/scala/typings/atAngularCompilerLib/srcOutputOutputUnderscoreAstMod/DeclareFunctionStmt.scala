package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "DeclareFunctionStmt")
@js.native
class DeclareFunctionStmt protected () extends Statement {
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement]) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, modifiers: js.Array[StmtModifier], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: Type, modifiers: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, modifiers: js.Array[StmtModifier], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, params: js.Array[FnParam], statements: js.Array[Statement], `type`: scala.Null, modifiers: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  var params: js.Array[FnParam] = js.native
  var statements: js.Array[Statement] = js.native
  var `type`: Type | scala.Null = js.native
}

