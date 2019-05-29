package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParseResult")
@js.native
class TemplateParseResult () extends js.Object {
  def this(templateAst: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary]) = this()
  def this(templateAst: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ], usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.UndefOr[scala.Nothing], errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary], errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  def this(templateAst: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ], usedPipes: js.UndefOr[scala.Nothing], errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  def this(templateAst: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ], usedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary], errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  var errors: js.UndefOr[js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]] = js.native
  var templateAst: js.UndefOr[
    js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ]
  ] = js.native
  var usedPipes: js.UndefOr[
    js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary]
  ] = js.native
}

