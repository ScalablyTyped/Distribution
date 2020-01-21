package typings.atlassianCrowdClient.sessionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
class ^ protected () extends Session {
  def this(token: String, createdAt: Date, expiresAt: Date) = this()
  /* CompleteClass */
  override val createdAt: Date = js.native
  /* CompleteClass */
  override val expiresAt: Date = js.native
  /* CompleteClass */
  override val token: String = js.native
  /* CompleteClass */
  override def toCrowd(): SessionObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(obj: SessionObj): Session = js.native
}

