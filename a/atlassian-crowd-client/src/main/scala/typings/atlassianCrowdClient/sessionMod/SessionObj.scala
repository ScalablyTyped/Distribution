package typings.atlassianCrowdClient.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionObj extends js.Object {
  val `created-date`: Double = js.native
  val `expiry-date`: Double = js.native
  val token: String = js.native
}

object SessionObj {
  @scala.inline
  def apply(`created-date`: Double, `expiry-date`: Double, token: String): SessionObj = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("created-date")(`created-date`.asInstanceOf[js.Any])
    __obj.updateDynamic("expiry-date")(`expiry-date`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionObj]
  }
  @scala.inline
  implicit class SessionObjOps[Self <: SessionObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setCreated-date`(value: Double): Self = this.set("created-date", value.asInstanceOf[js.Any])
    @scala.inline
    def `setExpiry-date`(value: Double): Self = this.set("expiry-date", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

