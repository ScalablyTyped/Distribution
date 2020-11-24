package typings.angularCompiler.publicApiMod

import typings.angularCompiler.mlParserAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ExpansionCase")
@js.native
class ExpansionCase protected ()
  extends typings.angularCompiler.srcCompilerMod.ExpansionCase {
  def this(
    value: String,
    expression: js.Array[Node],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    expSourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
