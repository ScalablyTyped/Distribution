package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeSessionRequest extends js.Object {
  /**
    * The ID of the disconnected session to resume.
    */
  var SessionId: typings.awsDashSdk.clientsSsmMod.SessionId
}

object ResumeSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): ResumeSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId)
  
    __obj.asInstanceOf[ResumeSessionRequest]
  }
}

