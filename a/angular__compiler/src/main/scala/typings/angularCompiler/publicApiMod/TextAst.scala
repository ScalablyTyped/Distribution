package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TextAst")
@js.native
class TextAst protected ()
  extends typings.angularCompiler.srcCompilerMod.TextAst {
  def this(
    value: String,
    ngContentIndex: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

