package typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod

import typings.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typings.atAngularPlatformDashBrowser.Anon_AppId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "BrowserModule")
@js.native
class BrowserModule () extends js.Object {
  def this(parentModule: BrowserModule) = this()
}

/* static members */
@JSImport("@angular/platform-browser", "BrowserModule")
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
  def withServerTransition(params: Anon_AppId): ModuleWithProviders[BrowserModule] = js.native
}

