package typings
package atlassianDashCrowdDashClientLib.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionObj extends js.Object {
  val `created-date`: scala.Double
  val `expiry-date`: scala.Double
  val token: java.lang.String
}

object SessionObj {
  @scala.inline
  def apply(`created-date`: scala.Double, `expiry-date`: scala.Double, token: java.lang.String): SessionObj = {
    val __obj = js.Dynamic.literal(token = token)
    __obj.updateDynamic("created-date")(`created-date`)
    __obj.updateDynamic("expiry-date")(`expiry-date`)
    __obj.asInstanceOf[SessionObj]
  }
}

