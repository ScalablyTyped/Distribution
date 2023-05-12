package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.anon.AppId
import typings.angularPlatformBrowser.anon.Optional
import typings.angularPlatformBrowser.anon.TypeofApplicationModule
import typings.angularPlatformBrowser.anon.TypeofCommonModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "BrowserModule")
@js.native
open class BrowserModule () extends StObject {
  def this(providersAlreadyPresent: Boolean) = this()
}
/* static members */
object BrowserModule {
  
  @JSImport("@angular/platform-browser", "BrowserModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Configures a browser-based app to transition from a server-rendered app, if
    * one is present on the page.
    *
    * @param params An object containing an identifier for the app to transition.
    * The ID must match between the client and server versions of the app.
    * @returns The reconfigured `BrowserModule` to import into the app's root `AppModule`.
    *
    * @deprecated Use {@link APP_ID} instead to set the application ID.
    */
  inline def withServerTransition(params: AppId): ModuleWithProviders[BrowserModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withServerTransition")(params.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[BrowserModule]]
  
  @JSImport("@angular/platform-browser", "BrowserModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[BrowserModule, js.Array[Optional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[BrowserModule, js.Array[Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "BrowserModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[BrowserModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[BrowserModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "BrowserModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[
    BrowserModule, 
    scala.Nothing, 
    scala.Nothing, 
    js.Tuple2[TypeofCommonModule, TypeofApplicationModule]
  ] = js.native
  inline def ɵmod_=(
    x: ɵɵNgModuleDeclaration[
      BrowserModule, 
      scala.Nothing, 
      scala.Nothing, 
      js.Tuple2[TypeofCommonModule, TypeofApplicationModule]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}
