package typings.angularPlatformBrowserDynamic

import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularCore.testingMod.TestComponentRenderer
import typings.angularPlatformBrowserDynamic.anon.TypeofBrowserTestingModul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/platform-browser-dynamic/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser-dynamic/testing", "BrowserDynamicTestingModule")
  @js.native
  open class BrowserDynamicTestingModule () extends StObject
  /* static members */
  object BrowserDynamicTestingModule {
    
    @JSImport("@angular/platform-browser-dynamic/testing", "BrowserDynamicTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser-dynamic/testing", "BrowserDynamicTestingModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[BrowserDynamicTestingModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[BrowserDynamicTestingModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser-dynamic/testing", "BrowserDynamicTestingModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[BrowserDynamicTestingModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[BrowserDynamicTestingModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser-dynamic/testing", "BrowserDynamicTestingModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        BrowserDynamicTestingModule, 
        scala.Nothing, 
        scala.Nothing, 
        js.Array[TypeofBrowserTestingModul]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          BrowserDynamicTestingModule, 
          scala.Nothing, 
          scala.Nothing, 
          js.Array[TypeofBrowserTestingModul]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def platformBrowserDynamicTesting(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamicTesting")().asInstanceOf[PlatformRef]
  inline def platformBrowserDynamicTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserDynamicTesting")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
  
  @JSImport("@angular/platform-browser-dynamic/testing", "\u0275DOMTestComponentRenderer")
  @js.native
  open class ɵDOMTestComponentRenderer protected () extends TestComponentRenderer {
    def this(_doc: Any) = this()
    
    /* private */ var _doc: Any = js.native
    
    @JSName("removeAllRootElements")
    def removeAllRootElements_MɵDOMTestComponentRenderer(): Unit = js.native
  }
  /* static members */
  object ɵDOMTestComponentRenderer {
    
    @JSImport("@angular/platform-browser-dynamic/testing", "\u0275DOMTestComponentRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser-dynamic/testing", "\u0275DOMTestComponentRenderer.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ɵDOMTestComponentRenderer, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵDOMTestComponentRenderer, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser-dynamic/testing", "\u0275DOMTestComponentRenderer.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ɵDOMTestComponentRenderer] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵDOMTestComponentRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  inline def ɵplatformCoreDynamicTesting(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamicTesting")().asInstanceOf[PlatformRef]
  inline def ɵplatformCoreDynamicTesting(extraProviders: js.Array[Any]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275platformCoreDynamicTesting")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
}
