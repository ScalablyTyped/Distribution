package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateSessionRequest extends js.Object {
  /**
    * The ID of the session to terminate.
    */
  var SessionId: typings.awsDashSdk.clientsSsmMod.SessionId
}

object TerminateSessionRequest {
  @scala.inline
  def apply(SessionId: SessionId): TerminateSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId)
  
    __obj.asInstanceOf[TerminateSessionRequest]
  }
}

