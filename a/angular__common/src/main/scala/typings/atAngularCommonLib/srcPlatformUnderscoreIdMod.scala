package typings
package atAngularCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/platform_id", JSImport.Namespace)
@js.native
object srcPlatformUnderscoreIdMod extends js.Object {
  val PLATFORM_BROWSER_ID: atAngularCommonLib.atAngularCommonLibStrings.browser = js.native
  val PLATFORM_SERVER_ID: atAngularCommonLib.atAngularCommonLibStrings.server = js.native
  val PLATFORM_WORKER_APP_ID: atAngularCommonLib.atAngularCommonLibStrings.browserWorkerApp = js.native
  val PLATFORM_WORKER_UI_ID: atAngularCommonLib.atAngularCommonLibStrings.browserWorkerUi = js.native
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = js.native
  def isPlatformServer(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = js.native
}

