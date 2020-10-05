package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "CommentStmt")
@js.native
class CommentStmt protected ()
  extends typings.angularCompiler.compilerMod.CommentStmt {
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

