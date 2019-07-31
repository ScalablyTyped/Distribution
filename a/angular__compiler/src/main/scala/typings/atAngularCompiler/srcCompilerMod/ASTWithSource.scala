package typings.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ASTWithSource")
@js.native
class ASTWithSource protected ()
  extends typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ASTWithSource {
  def this(
    ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: String,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
  def this(
    ast: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    source: Null,
    location: String,
    absoluteOffset: Double,
    errors: js.Array[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
}

