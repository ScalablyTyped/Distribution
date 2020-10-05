package typings.angularCompiler.compilerMod

import typings.angularCompiler.metadataResolverMod.ErrorCollector
import typings.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "CompileMetadataResolver")
@js.native
class CompileMetadataResolver protected ()
  extends typings.angularCompiler.publicApiMod.CompileMetadataResolver {
  def this(
    _config: typings.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typings.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typings.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typings.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typings.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typings.angularCompiler.compileReflectorMod.CompileReflector
  ) = this()
  def this(
    _config: typings.angularCompiler.configMod.CompilerConfig,
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    _ngModuleResolver: typings.angularCompiler.ngModuleResolverMod.NgModuleResolver,
    _directiveResolver: typings.angularCompiler.directiveResolverMod.DirectiveResolver,
    _pipeResolver: typings.angularCompiler.pipeResolverMod.PipeResolver,
    _summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[_],
    _schemaRegistry: typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typings.angularCompiler.directiveNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typings.angularCompiler.staticSymbolMod.StaticSymbolCache,
    _reflector: typings.angularCompiler.compileReflectorMod.CompileReflector,
    _errorCollector: ErrorCollector
  ) = this()
}

