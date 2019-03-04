package typings
package atlassianDashCrowdDashClientLib.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  val createdAt: stdLib.Date
  val expiresAt: stdLib.Date
  val token: java.lang.String
  def toCrowd(): SessionObj
}

object Session {
  @scala.inline
  def apply(
    createdAt: stdLib.Date,
    expiresAt: stdLib.Date,
    toCrowd: js.Function0[SessionObj],
    token: java.lang.String
  ): Session = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, expiresAt = expiresAt, toCrowd = toCrowd, token = token)
  
    __obj.asInstanceOf[Session]
  }
}

