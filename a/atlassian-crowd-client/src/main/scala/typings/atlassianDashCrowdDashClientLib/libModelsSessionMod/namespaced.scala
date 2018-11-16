package typings
package atlassianDashCrowdDashClientLib.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
class namespaced protected () extends Session {
  def this(token: java.lang.String, createdAt: stdLib.Date, expiresAt: stdLib.Date) = this()
  /* CompleteClass */
  override val createdAt: stdLib.Date = js.native
  /* CompleteClass */
  override val expiresAt: stdLib.Date = js.native
  /* CompleteClass */
  override val token: java.lang.String = js.native
  /* CompleteClass */
  override def toCrowd(): SessionObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def fromCrowd(obj: atlassianDashCrowdDashClientLib.libModelsSessionMod.SessionObj): atlassianDashCrowdDashClientLib.libModelsSessionMod.Session = js.native
}

