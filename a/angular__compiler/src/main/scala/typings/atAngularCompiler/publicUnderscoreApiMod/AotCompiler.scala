package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typings.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import typings.atAngularCompiler.srcInjectableUnderscoreCompilerMod.InjectableCompiler
import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.OutputEmitter
import typings.atAngularCompiler.srcViewUnderscoreCompilerTypeUnderscoreCheckUnderscoreCompilerMod.TypeCheckCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AotCompiler")
@js.native
class AotCompiler protected ()
  extends typings.atAngularCompiler.srcCompilerMod.AotCompiler {
  def this(
    _config: typings.atAngularCompiler.srcConfigMod.CompilerConfig,
    _options: AotCompilerOptions,
    _host: AotCompilerHost,
    reflector: typings.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector,
    _metadataResolver: typings.atAngularCompiler.srcMetadataUnderscoreResolverMod.CompileMetadataResolver,
    _templateParser: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParser,
    _styleCompiler: typings.atAngularCompiler.srcStyleUnderscoreCompilerMod.StyleCompiler,
    _viewCompiler: typings.atAngularCompiler.srcViewUnderscoreCompilerViewUnderscoreCompilerMod.ViewCompiler,
    _typeCheckCompiler: TypeCheckCompiler,
    _ngModuleCompiler: typings.atAngularCompiler.srcNgUnderscoreModuleUnderscoreCompilerMod.NgModuleCompiler,
    _injectableCompiler: InjectableCompiler,
    _outputEmitter: OutputEmitter,
    _summaryResolver: typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver[typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol],
    _symbolResolver: typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolver
  ) = this()
}

