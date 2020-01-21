package typings.angularCompiler.mod

import typings.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typings.angularCompiler.publicApiMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(tags: js.Array[JSDocTag], sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}

