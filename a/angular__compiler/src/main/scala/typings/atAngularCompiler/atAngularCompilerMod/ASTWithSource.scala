package typings.atAngularCompiler.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.ASTWithSource {
  def this(
    ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: String,
    location: String,
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
  def this(
    ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: Null,
    location: String,
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
}

