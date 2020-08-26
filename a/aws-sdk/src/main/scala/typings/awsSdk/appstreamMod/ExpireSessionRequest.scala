package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpireSessionRequest extends js.Object {
  /**
    * The identifier of the streaming session.
    */
  var SessionId: String = js.native
}

object ExpireSessionRequest {
  @scala.inline
  def apply(SessionId: String): ExpireSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpireSessionRequest]
  }
  @scala.inline
  implicit class ExpireSessionRequestOps[Self <: ExpireSessionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSessionId(value: String): Self = this.set("SessionId", value.asInstanceOf[js.Any])
  }
  
}

