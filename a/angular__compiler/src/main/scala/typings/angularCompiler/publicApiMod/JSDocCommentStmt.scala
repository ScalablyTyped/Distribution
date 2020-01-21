package typings.angularCompiler.publicApiMod

import typings.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "JSDocCommentStmt")
@js.native
class JSDocCommentStmt ()
  extends typings.angularCompiler.srcCompilerMod.JSDocCommentStmt {
  def this(tags: js.Array[JSDocTag]) = this()
  def this(tags: js.Array[JSDocTag], sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}

