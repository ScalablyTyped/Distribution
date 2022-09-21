package typings.angularCommon.anon

import org.scalablytyped.runtime.Instantiable0
import typings.angularCommon.httpMod.HttpClientXsrfModule
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHttpClientXsrfModul
  extends StObject
     with Instantiable0[HttpClientXsrfModule] {
  
  /**
    * Disable the default XSRF protection.
    */
  def disable(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[HttpClientXsrfModule, scala.Nothing] = js.native
  
  var ɵinj: ɵɵInjectorDeclaration[HttpClientXsrfModule] = js.native
  
  var ɵmod: ɵɵNgModuleDeclaration[HttpClientXsrfModule, scala.Nothing, scala.Nothing, scala.Nothing] = js.native
}
