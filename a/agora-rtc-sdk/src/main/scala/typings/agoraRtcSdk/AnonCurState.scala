package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurState extends js.Object {
  /** The current connection state. */
  var curState: String
  /**  The previous connection state. */
  var prevState: String
}

object AnonCurState {
  @scala.inline
  def apply(curState: String, prevState: String): AnonCurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurState]
  }
}

