package typings.atlassianDashCrowdDashClient.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionObj extends js.Object {
  val `created-date`: Double
  val `expiry-date`: Double
  val token: String
}

object SessionObj {
  @scala.inline
  def apply(`created-date`: Double, `expiry-date`: Double, token: String): SessionObj = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("created-date")(`created-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("expiry-date")(`expiry-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionObj]
  }
}

