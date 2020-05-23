package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurState extends js.Object {
  /** The current connection state. */
  var curState: String
  /**  The previous connection state. */
  var prevState: String
}

object CurState {
  @scala.inline
  def apply(curState: String, prevState: String): CurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurState]
  }
}

