package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt () extends Statement {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(tags: js.Array[JSDocTag], sourceSpan: ParseSourceSpan) = this()
  var tags: js.Array[JSDocTag] = js.native
}

