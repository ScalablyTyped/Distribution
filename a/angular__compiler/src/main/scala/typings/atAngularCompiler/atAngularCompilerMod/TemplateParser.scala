package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAstVisitor
import typings.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.TemplateParser {
  def this(
    _config: typings.atAngularCompiler.srcConfigMod.CompilerConfig,
    _reflector: typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _exprParser: typings.atAngularCompiler.srcExpressionUnderscoreParserParserMod.Parser,
    _schemaRegistry: typings.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry,
    _htmlParser: typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

