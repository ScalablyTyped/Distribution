package typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParseResult")
@js.native
class TemplateParseResult () extends js.Object {
  def this(templateAst: js.Array[TemplateAst]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[ParseError]
  ) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[ParseError]
  ) = this()
  var errors: js.UndefOr[js.Array[ParseError]] = js.native
  var templateAst: js.UndefOr[js.Array[TemplateAst]] = js.native
  var usedPipes: js.UndefOr[js.Array[CompilePipeSummary]] = js.native
}

