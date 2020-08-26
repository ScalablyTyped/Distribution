package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "CommentStmt")
@js.native
class CommentStmt protected ()
  extends typings.angularCompiler.srcCompilerMod.CommentStmt {
  def this(comment: String) = this()
  def this(comment: String, multiline: Boolean) = this()
  def this(
    comment: String,
    multiline: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    comment: String,
    multiline: Boolean,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

