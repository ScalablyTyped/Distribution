package typings.angularPlatformBrowserDynamic

import typings.angularCompiler.mod.CompileMetadataResolver
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.CompilerConfig
import typings.angularCompiler.mod.JitEvaluator
import typings.angularCompiler.mod.NgModuleCompiler
import typings.angularCompiler.mod.ResourceLoader
import typings.angularCompiler.mod.StyleCompiler
import typings.angularCompiler.mod.SummaryResolver
import typings.angularCompiler.mod.TemplateParser
import typings.angularCompiler.mod.ViewCompiler
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.CompilerFactory
import typings.angularCore.mod.ComponentFactory
import typings.angularCore.mod.Injector
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularCore.mod.ɵConsole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-browser-dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "JitCompilerFactory")
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    
    /* private */ var _defaultOptions: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "RESOURCE_CACHE_PROVIDER")
  @js.native
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  inline def platformBrowserDynamic(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamic")().asInstanceOf[PlatformRef]
  inline def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamic")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275COMPILER_PROVIDERS__POST_R3__")
  @js.native
  val ɵCOMPILERPROVIDERSPOSTR3: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275CompilerImpl")
  @js.native
  class ɵCompilerImpl protected () extends Compiler {
    def this(
      injector: Injector,
      _metadataResolver: CompileMetadataResolver,
      templateParser: TemplateParser,
      styleCompiler: StyleCompiler,
      viewCompiler: ViewCompiler,
      ngModuleCompiler: NgModuleCompiler,
      summaryResolver: SummaryResolver[Type[js.Any]],
      compileReflector: CompileReflector,
      jitEvaluator: JitEvaluator,
      compilerConfig: CompilerConfig,
      console: ɵConsole
    ) = this()
    
    /* private */ var _delegate: js.Any = js.native
    
    /* private */ var _metadataResolver: js.Any = js.native
    
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    
    /* private */ var getExtraNgModuleProviders: js.Any = js.native
    
    def hasAotSummary(ref: Type[js.Any]): Boolean = js.native
    
    val injector: Injector = js.native
    
    def loadAotSummaries(summaries: js.Function0[js.Array[js.Any]]): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALBROWSERDYNAMICPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275ResourceLoaderImpl")
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275angular_packages_platform_browser_dynamic_platform_browser_dynamic_a")
  @js.native
  class ɵangularPackagesPlatformBrowserDynamicPlatformBrowserDynamicA () extends ResourceLoader {
    
    /* private */ var _cache: js.Any = js.native
  }
  
  inline def ɵplatformCoreDynamic(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamic")().asInstanceOf[PlatformRef]
  inline def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamic")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
}
