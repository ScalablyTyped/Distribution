package typings.atlassianCrowdClient.sessionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
class ^ protected () extends Session {
  def this(token: String, createdAt: Date, expiresAt: Date) = this()
}
@JSImport("atlassian-crowd-client/lib/models/session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def fromCrowd(obj: SessionObj): Session = js.native
}
