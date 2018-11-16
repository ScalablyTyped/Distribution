package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_parser", "TemplateParser")
@js.native
class TemplateParser protected () extends js.Object {
  def this(_config: atAngularCompilerLib.srcConfigMod.CompilerConfig, _reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, _exprParser: atAngularCompilerLib.srcExpressionUnderscoreParserParserMod.Parser, _schemaRegistry: atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry, _htmlParser: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser, _console: atAngularCompilerLib.srcUtilMod.Console, transforms: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
    ]) = this()
  var _config: js.Any = js.native
  var _console: js.Any = js.native
  var _exprParser: js.Any = js.native
  var _htmlParser: js.Any = js.native
  var _reflector: js.Any = js.native
  var _schemaRegistry: js.Any = js.native
  val expressionParser: atAngularCompilerLib.srcExpressionUnderscoreParserParserMod.Parser = js.native
  var transforms: js.Array[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
  ] = js.native
  def expandHtml(
    htmlAstWithErrors: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult
  ): atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult = js.native
  def expandHtml(
    htmlAstWithErrors: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult,
    forced: scala.Boolean
  ): atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult = js.native
  def getInterpolationConfig(component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata): js.UndefOr[
    atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ] = js.native
  def parse(
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult,
    directives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary],
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata],
    templateUrl: java.lang.String,
    preserveWhitespaces: scala.Boolean
  ): atAngularCompilerLib.Anon_Pipes = js.native
  def parse(
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: java.lang.String,
    directives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary],
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata],
    templateUrl: java.lang.String,
    preserveWhitespaces: scala.Boolean
  ): atAngularCompilerLib.Anon_Pipes = js.native
  def tryParse(
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult,
    directives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary],
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata],
    templateUrl: java.lang.String,
    preserveWhitespaces: scala.Boolean
  ): TemplateParseResult = js.native
  def tryParse(
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    template: java.lang.String,
    directives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary],
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata],
    templateUrl: java.lang.String,
    preserveWhitespaces: scala.Boolean
  ): TemplateParseResult = js.native
  def tryParseHtml(
    htmlAstWithErrors: atAngularCompilerLib.srcMlUnderscoreParserHtmlUnderscoreParserMod.ParseTreeResult,
    component: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata,
    directives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary],
    pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata]
  ): TemplateParseResult = js.native
}

