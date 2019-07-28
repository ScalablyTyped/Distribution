package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateParseResult")
@js.native
class TemplateParseResult ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.TemplateParseResult {
  def this(templateAst: js.Array[TemplateAst]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

