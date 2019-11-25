package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ParsedProperty")
@js.native
class ParsedProperty protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.ParsedProperty {
  def this(
    name: String,
    expression: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ASTWithSource,
    `type`: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedPropertyType,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ASTWithSource,
    `type`: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParsedPropertyType,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    valueSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

