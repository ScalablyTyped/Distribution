package typings
package atAngularCompilerLib.srcJitCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/jit/compiler", "JitCompiler")
@js.native
class JitCompiler protected () extends js.Object {
  def this(_metadataResolver: atAngularCompilerLib.srcMetadataUnderscoreResolverMod.CompileMetadataResolver, _templateParser: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser, _styleCompiler: atAngularCompilerLib.srcStyleUnderscoreCompilerMod.StyleCompiler, _viewCompiler: atAngularCompilerLib.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler, _ngModuleCompiler: atAngularCompilerLib.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler, _summaryResolver: atAngularCompilerLib.srcSummaryUnderscoreResolverMod.SummaryResolver[atAngularCompilerLib.srcCoreMod.Type], _reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector, _jitEvaluator: atAngularCompilerLib.srcOutputOutputUnderscoreJitMod.JitEvaluator, _compilerConfig: atAngularCompilerLib.srcConfigMod.CompilerConfig, _console: atAngularCompilerLib.srcUtilMod.Console, getExtraNgModuleProviders: js.Function1[
      /* ngModule */ js.Any, 
      js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
    ]) = this()
  var _addAotSummaries: js.Any = js.native
  var _addedAotSummaries: js.Any = js.native
  var _compileModule: js.Any = js.native
  var _compileModuleAndAllComponents: js.Any = js.native
  var _compileModuleAndComponents: js.Any = js.native
  var _compileTemplate: js.Any = js.native
  var _compiledDirectiveWrapperCache: js.Any = js.native
  var _compiledHostTemplateCache: js.Any = js.native
  var _compiledNgModuleCache: js.Any = js.native
  var _compiledTemplateCache: js.Any = js.native
  var _compilerConfig: js.Any = js.native
  var _console: js.Any = js.native
  var _createCompiledHostTemplate: js.Any = js.native
  var _createCompiledTemplate: js.Any = js.native
  var _filterJitIdentifiers: js.Any = js.native
  var _interpretOrJit: js.Any = js.native
  var _jitEvaluator: js.Any = js.native
  var _loadModules: js.Any = js.native
  var _metadataResolver: js.Any = js.native
  var _ngModuleCompiler: js.Any = js.native
  var _parseTemplate: js.Any = js.native
  var _reflector: js.Any = js.native
  var _resolveAndEvalStylesCompileResult: js.Any = js.native
  var _resolveStylesCompileResult: js.Any = js.native
  var _sharedStylesheetCount: js.Any = js.native
  var _styleCompiler: js.Any = js.native
  var _summaryResolver: js.Any = js.native
  var _templateParser: js.Any = js.native
  var _viewCompiler: js.Any = js.native
  var getExtraNgModuleProviders: js.Any = js.native
  def clearCache(): scala.Unit = js.native
  def clearCacheFor(`type`: atAngularCompilerLib.srcCoreMod.Type): scala.Unit = js.native
  def compileModuleAndAllComponentsAsync(moduleType: atAngularCompilerLib.srcCoreMod.Type): js.Promise[ModuleWithComponentFactories] = js.native
  def compileModuleAndAllComponentsSync(moduleType: atAngularCompilerLib.srcCoreMod.Type): ModuleWithComponentFactories = js.native
  def compileModuleAsync(moduleType: atAngularCompilerLib.srcCoreMod.Type): js.Promise[js.Object] = js.native
  def compileModuleSync(moduleType: atAngularCompilerLib.srcCoreMod.Type): js.Object = js.native
  def getComponentFactory(component: atAngularCompilerLib.srcCoreMod.Type): js.Object = js.native
  def hasAotSummary(ref: atAngularCompilerLib.srcCoreMod.Type): scala.Boolean = js.native
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): scala.Unit = js.native
}

