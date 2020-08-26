package typings.angularCompiler.compilerMod

import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "JitCompiler")
@js.native
class JitCompiler protected ()
  extends typings.angularCompiler.publicApiMod.JitCompiler {
  def this(
    _metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typings.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typings.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typings.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _ngModuleCompiler: typings.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.coreMod.Type],
    _reflector: typings.angularCompiler.compileReflectorMod.CompileReflector,
    _jitEvaluator: typings.angularCompiler.outputJitMod.JitEvaluator,
    _compilerConfig: typings.angularCompiler.configMod.CompilerConfig,
    _console: Console,
    getExtraNgModuleProviders: js.Function1[/* ngModule */ js.Any, js.Array[CompileProviderMetadata]]
  ) = this()
}

