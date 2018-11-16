package typings
package atAngularPlatformDashBrowserLib.srcBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/browser", JSImport.Namespace)
@js.native
object srcBrowserModMembers extends js.Object {
  val BROWSER_MODULE_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val BROWSER_SANITIZATION_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val INTERNAL_BROWSER_PLATFORM_PROVIDERS: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider] = js.native
  val platformBrowser: js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    atAngularCoreLib.coreMod.PlatformRef
  ] = js.native
  def _document(): js.Any = js.native
  def errorHandler(): atAngularCoreLib.coreMod.ErrorHandler = js.native
  def initDomAdapter(): scala.Unit = js.native
}

