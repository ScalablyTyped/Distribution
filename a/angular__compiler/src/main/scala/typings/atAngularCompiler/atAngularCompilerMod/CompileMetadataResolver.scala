package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.ErrorCollector
import typings.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompileMetadataResolver")
@js.native
class CompileMetadataResolver protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.CompileMetadataResolver {
  def this(
    _config: typings.atAngularCompiler.srcConfigMod.CompilerConfig,
    _htmlParser: typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    _ngModuleResolver: typings.atAngularCompiler.srcNgUnderscoreModuleUnderscoreResolverMod.NgModuleResolver,
    _directiveResolver: typings.atAngularCompiler.srcDirectiveUnderscoreResolverMod.DirectiveResolver,
    _pipeResolver: typings.atAngularCompiler.srcPipeUnderscoreResolverMod.PipeResolver,
    _summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[_],
    _schemaRegistry: typings.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typings.atAngularCompiler.srcDirectiveUnderscoreNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    _reflector: typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
  ) = this()
  def this(
    _config: typings.atAngularCompiler.srcConfigMod.CompilerConfig,
    _htmlParser: typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser,
    _ngModuleResolver: typings.atAngularCompiler.srcNgUnderscoreModuleUnderscoreResolverMod.NgModuleResolver,
    _directiveResolver: typings.atAngularCompiler.srcDirectiveUnderscoreResolverMod.DirectiveResolver,
    _pipeResolver: typings.atAngularCompiler.srcPipeUnderscoreResolverMod.PipeResolver,
    _summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[_],
    _schemaRegistry: typings.atAngularCompiler.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry,
    _directiveNormalizer: typings.atAngularCompiler.srcDirectiveUnderscoreNormalizerMod.DirectiveNormalizer,
    _console: Console,
    _staticSymbolCache: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache,
    _reflector: typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _errorCollector: ErrorCollector
  ) = this()
}

