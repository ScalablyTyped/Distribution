package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateSessionResponse extends js.Object {
  /**
    * The ID of the session that has been terminated.
    */
  var SessionId: js.UndefOr[SessionId] = js.undefined
}

object TerminateSessionResponse {
  @scala.inline
  def apply(SessionId: SessionId = null): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (SessionId != null) __obj.updateDynamic("SessionId")(SessionId)
    __obj.asInstanceOf[TerminateSessionResponse]
  }
}

