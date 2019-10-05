package typings.atAngularPlatformDashBrowserDashDynamic

import typings.atAngularCompiler.atAngularCompilerMod.CompileMetadataResolver
import typings.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typings.atAngularCompiler.atAngularCompilerMod.CompilerConfig
import typings.atAngularCompiler.atAngularCompilerMod.JitEvaluator
import typings.atAngularCompiler.atAngularCompilerMod.NgModuleCompiler
import typings.atAngularCompiler.atAngularCompilerMod.ResourceLoader
import typings.atAngularCompiler.atAngularCompilerMod.StyleCompiler
import typings.atAngularCompiler.atAngularCompilerMod.SummaryResolver
import typings.atAngularCompiler.atAngularCompilerMod.TemplateParser
import typings.atAngularCompiler.atAngularCompilerMod.ViewCompiler
import typings.atAngularCore.atAngularCoreMod.Compiler
import typings.atAngularCore.atAngularCoreMod.CompilerFactory
import typings.atAngularCore.atAngularCoreMod.ComponentFactory
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.PlatformRef
import typings.atAngularCore.atAngularCoreMod.Provider
import typings.atAngularCore.atAngularCoreMod.StaticProvider
import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreMod.Version
import typings.atAngularCore.atAngularCoreMod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", JSImport.Namespace)
@js.native
object atAngularPlatformDashBrowserDashDynamicMod extends js.Object {
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    var _defaultOptions: js.Any = js.native
  }
  
  @js.native
  class ɵCompilerImpl protected () extends Compiler {
    def this(
      injector: Injector,
      _metadataResolver: CompileMetadataResolver,
      templateParser: TemplateParser,
      styleCompiler: StyleCompiler,
      viewCompiler: ViewCompiler,
      ngModuleCompiler: NgModuleCompiler,
      summaryResolver: SummaryResolver[Type[_]],
      compileReflector: CompileReflector,
      jitEvaluator: JitEvaluator,
      compilerConfig: CompilerConfig,
      console: ɵConsole
    ) = this()
    var _delegate: js.Any = js.native
    var _metadataResolver: js.Any = js.native
    var getExtraNgModuleProviders: js.Any = js.native
    val injector: Injector = js.native
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    def hasAotSummary(ref: Type[_]): Boolean = js.native
    def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  }
  
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @js.native
  class ɵangular_packages_platform_browser_dynamic_platform_browser_dynamic_a () extends ResourceLoader {
    var _cache: js.Any = js.native
  }
  
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  val VERSION: Version = js.native
  val ɵINTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS: js.Array[StaticProvider] = js.native
  def platformBrowserDynamic(): PlatformRef = js.native
  def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  def ɵplatformCoreDynamic(): PlatformRef = js.native
  def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
}

