package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "CommentStmt")
@js.native
class CommentStmt protected () extends Statement {
  def this(comment: String) = this()
  def this(comment: String, multiline: Boolean) = this()
  def this(comment: String, multiline: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(comment: String, multiline: Boolean, sourceSpan: ParseSourceSpan) = this()
  var comment: String = js.native
  var multiline: Boolean = js.native
}

