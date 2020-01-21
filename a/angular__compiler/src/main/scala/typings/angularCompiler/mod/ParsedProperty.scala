package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParsedProperty")
@js.native
class ParsedProperty protected ()
  extends typings.angularCompiler.publicApiMod.ParsedProperty {
  def this(
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource,
    `type`: typings.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource,
    `type`: typings.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

