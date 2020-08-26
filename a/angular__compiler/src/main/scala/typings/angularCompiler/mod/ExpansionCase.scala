package typings.angularCompiler.mod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ExpansionCase")
@js.native
class ExpansionCase protected ()
  extends typings.angularCompiler.compilerMod.ExpansionCase {
  def this(
    value: String,
    expression: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    expSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

