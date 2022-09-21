package typings.angularPlatformBrowserDynamic

import typings.angularCore.mod.CompilerFactory
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-browser-dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "JitCompilerFactory")
  @js.native
  open class JitCompilerFactory () extends CompilerFactory {
    
    /* private */ var _defaultOptions: Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "RESOURCE_CACHE_PROVIDER")
  @js.native
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  inline def platformBrowserDynamic(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamic")().asInstanceOf[PlatformRef]
  inline def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamic")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALBROWSERDYNAMICPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  inline def ɵplatformCoreDynamic(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamic")().asInstanceOf[PlatformRef]
  inline def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamic")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
}
