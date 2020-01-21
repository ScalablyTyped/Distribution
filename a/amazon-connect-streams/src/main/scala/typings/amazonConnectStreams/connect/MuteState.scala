package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuteState extends js.Object {
  var muted: Boolean
}

object MuteState {
  @scala.inline
  def apply(muted: Boolean): MuteState = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MuteState]
  }
}

