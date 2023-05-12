package typings.angularPlatformServer

import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformServer.anon.TypeofBrowserDynamicTesti
import typings.angularPlatformServer.anon.TypeofNoopAnimationsModul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/platform-server/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-server/testing", "ServerTestingModule")
  @js.native
  open class ServerTestingModule () extends StObject
  /* static members */
  object ServerTestingModule {
    
    @JSImport("@angular/platform-server/testing", "ServerTestingModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/platform-server/testing", "ServerTestingModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ServerTestingModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ServerTestingModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server/testing", "ServerTestingModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[ServerTestingModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[ServerTestingModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/platform-server/testing", "ServerTestingModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        ServerTestingModule, 
        scala.Nothing, 
        js.Array[TypeofNoopAnimationsModul], 
        js.Array[TypeofBrowserDynamicTesti]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          ServerTestingModule, 
          scala.Nothing, 
          js.Array[TypeofNoopAnimationsModul], 
          js.Array[TypeofBrowserDynamicTesti]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def platformServerTesting(): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformServerTesting")().asInstanceOf[PlatformRef]
  inline def platformServerTesting(extraProviders: js.Array[StaticProvider]): PlatformRef = ^.asInstanceOf[js.Dynamic].applyDynamic("platformServerTesting")(extraProviders.asInstanceOf[js.Any]).asInstanceOf[PlatformRef]
}
