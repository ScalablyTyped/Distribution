package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.abstractEmitterMod.OutputEmitter
import typings.angularCompiler.compilerHostMod.AotCompilerHost
import typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typings.angularCompiler.injectableCompilerMod.InjectableCompiler
import typings.angularCompiler.typeCheckCompilerMod.TypeCheckCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "AotCompiler")
@js.native
class AotCompiler protected ()
  extends typings.angularCompiler.aotCompilerMod.AotCompiler {
  def this(
    _config: typings.angularCompiler.configMod.CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: typings.angularCompiler.staticReflectorMod.StaticReflector,
    _metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    _templateParser: typings.angularCompiler.templateParserMod.TemplateParser,
    _styleCompiler: typings.angularCompiler.styleCompilerMod.StyleCompiler,
    _viewCompiler: typings.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: typings.angularCompiler.ngModuleCompilerMod.NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: typings.angularCompiler.srcSummaryResolverMod.SummaryResolver[typings.angularCompiler.staticSymbolMod.StaticSymbol],
    _symbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
  ) = this()
}

