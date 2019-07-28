package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typings.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typings.atAngularCompiler.srcCompilerMod.JitCompiler {
  def this(
    _metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    _templateParser: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser,
    _styleCompiler: typings.atAngularCompiler.srcStyleUnderscoreCompilerMod.StyleCompiler,
    _viewCompiler: typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler,
    _ngModuleCompiler: typings.atAngularCompiler.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler,
    _summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcCoreMod.Type],
    _reflector: typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector,
    _jitEvaluator: typings.atAngularCompiler.srcOutputOutputUnderscoreJitMod.JitEvaluator,
    _compilerConfig: typings.atAngularCompiler.srcConfigMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}

