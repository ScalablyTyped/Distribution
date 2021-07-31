package typings.angularCommon.httpHttpMod

import typings.angularCommon.anon.CookieName
import typings.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpClientXsrfModule")
@js.native
class HttpClientXsrfModule () extends StObject
/* static members */
object HttpClientXsrfModule {
  
  @JSImport("@angular/common/http/http", "HttpClientXsrfModule")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Disable the default XSRF protection.
    */
  @scala.inline
  def disable(): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  @scala.inline
  def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")().asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
  @scala.inline
  def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[HttpClientXsrfModule]]
}
