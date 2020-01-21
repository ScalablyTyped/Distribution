package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CommentStmt")
@js.native
class CommentStmt protected ()
  extends typings.angularCompiler.publicApiMod.CommentStmt {
  def this(comment: String) = this()
  def this(comment: String, multiline: Boolean) = this()
  def this(
    comment: String,
    multiline: Boolean,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

