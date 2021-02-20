package typings.angularCommon.httpHttpMod

import typings.angularCommon.anon.CookieName
import typings.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpClientXsrfModule")
@js.native
class HttpClientXsrfModule () extends StObject
/* static members */
object HttpClientXsrfModule {
  
  /**
    * Disable the default XSRF protection.
    */
  @JSImport("@angular/common/http/http", "HttpClientXsrfModule.disable")
  @js.native
  def disable(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  
  /**
    * Configure XSRF protection.
    * @param options An object that can specify either or both
    * cookie name or header name.
    * - Cookie name default is `XSRF-TOKEN`.
    * - Header name default is `X-XSRF-TOKEN`.
    *
    */
  @JSImport("@angular/common/http/http", "HttpClientXsrfModule.withOptions")
  @js.native
  def withOptions(): ModuleWithProviders[HttpClientXsrfModule] = js.native
  @JSImport("@angular/common/http/http", "HttpClientXsrfModule.withOptions")
  @js.native
  def withOptions(options: CookieName): ModuleWithProviders[HttpClientXsrfModule] = js.native
}
