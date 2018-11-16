package typings
package atAngularCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/platform_id", JSImport.Namespace)
@js.native
object srcPlatformUnderscoreIdMod extends js.Object {
  val PLATFORM_BROWSER_ID: /* browser */ java.lang.String = js.native
  val PLATFORM_SERVER_ID: /* server */ java.lang.String = js.native
  val PLATFORM_WORKER_APP_ID: /* browserWorkerApp */ java.lang.String = js.native
  val PLATFORM_WORKER_UI_ID: /* browserWorkerUi */ java.lang.String = js.native
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = js.native
  def isPlatformServer(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = js.native
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = js.native
}

