package typings.angularCompiler.publicApiMod

import typings.angularCompiler.srcUtilMod.Console
import typings.angularCompiler.templateAstMod.TemplateAstVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParser")
@js.native
class TemplateParser protected ()
  extends typings.angularCompiler.srcCompilerMod.TemplateParser {
  def this(
    _config: typings.angularCompiler.configMod.CompilerConfig,
    _reflector: typings.angularCompiler.compileReflectorMod.CompileReflector,
    _exprParser: typings.angularCompiler.parserMod.Parser,
    _schemaRegistry: typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _console: Null,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
  def this(
    _config: typings.angularCompiler.configMod.CompilerConfig,
    _reflector: typings.angularCompiler.compileReflectorMod.CompileReflector,
    _exprParser: typings.angularCompiler.parserMod.Parser,
    _schemaRegistry: typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _console: Console,
    transforms: js.Array[TemplateAstVisitor]
  ) = this()
}

