package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ModuleWithProviders
import typings.angularPlatformBrowser.anon.AppId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def withServerTransition(params: AppId): ModuleWithProviders[BrowserModule] = js.native
}

