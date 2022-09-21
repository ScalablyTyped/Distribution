package typings.angularCommon.httpMod

import typings.angularCommon.anon.CookieName
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpClientXsrfModule")
@js.native
open class HttpClientXsrfModule () extends StObject
/* static members */
object HttpClientXsrfModule {
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Disable the default XSRF protection.
    */
  inline def disable(): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  inline def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")().asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
  inline def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[HttpClientXsrfModule, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[HttpClientXsrfModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[HttpClientXsrfModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[HttpClientXsrfModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[HttpClientXsrfModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
  inline def ɵmod_=(x: ɵɵNgModuleDeclaration[HttpClientXsrfModule, scala.Nothing, scala.Nothing, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}
