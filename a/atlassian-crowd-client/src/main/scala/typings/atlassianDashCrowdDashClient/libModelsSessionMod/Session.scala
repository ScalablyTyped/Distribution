package typings.atlassianDashCrowdDashClient.libModelsSessionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  val createdAt: Date
  val expiresAt: Date
  val token: String
  def toCrowd(): SessionObj
}

object Session {
  @scala.inline
  def apply(createdAt: Date, expiresAt: Date, toCrowd: () => SessionObj, token: String): Session = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Session]
  }
}

