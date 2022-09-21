package typings.angularPlatformBrowser

import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.anon.TypeofBrowserModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/platform-browser/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser/testing", "BrowserTestingModule")
  @js.native
  open class BrowserTestingModule () extends StObject
  /* static members */
  object BrowserTestingModule {
    
    @JSImport("@angular/platform-browser/testing", "BrowserTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-browser/testing", "BrowserTestingModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[BrowserTestingModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[BrowserTestingModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/testing", "BrowserTestingModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[BrowserTestingModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[BrowserTestingModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-browser/testing", "BrowserTestingModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[BrowserTestingModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[BrowserTestingModule, scala.Nothing, scala.Nothing, js.Array[TypeofBrowserModule]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def platformBrowserTesting(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserTesting")().asInstanceOf[PlatformRef]
  inline def platformBrowserTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformBrowserTesting")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
}
