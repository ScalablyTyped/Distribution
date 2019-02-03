package typings
package atAngularPlatformDashBrowserLib.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/public_api", "BrowserModule")
@js.native
class BrowserModule ()
  extends atAngularPlatformDashBrowserLib.srcPlatformDashBrowserMod.BrowserModule {
  def this(parentModule: atAngularPlatformDashBrowserLib.srcBrowserMod.BrowserModule) = this()
}

/* static members */
@JSImport("@angular/platform-browser/public_api", "BrowserModule")
@js.native
object BrowserModule extends js.Object {
  /**
    * Configures a browser-based app to transition from a server-rendered app, if
    * one is present on the page.
    *
    * @param params An object containing an identifier for the app to transition.
    * The ID must match between the client and server versions of the app.
    * @returns The reconfigured `BrowserModule` to import into the app's root `AppModule`.
    */
  def withServerTransition(params: atAngularPlatformDashBrowserLib.Anon_AppId): atAngularCoreLib.srcMetadataNgUnderscoreModuleMod.ModuleWithProviders[atAngularPlatformDashBrowserLib.srcBrowserMod.BrowserModule] = js.native
}

