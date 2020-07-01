package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentMutedStatus extends js.Object {
  /** A value indicating whether the agent local media is muted. */
  val muted: Boolean
}

object AgentMutedStatus {
  @scala.inline
  def apply(muted: Boolean): AgentMutedStatus = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentMutedStatus]
  }
}

