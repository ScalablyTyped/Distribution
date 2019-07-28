package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typings.atAngularCompiler.srcCompilerMod.ASTWithSource {
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

