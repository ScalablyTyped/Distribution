package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurState extends js.Object {
  /** The current connection state. */
  var curState: String
  /**  The previous connection state. */
  var prevState: String
}

object Anon_CurState {
  @scala.inline
  def apply(curState: String, prevState: String): Anon_CurState = {
    val __obj = js.Dynamic.literal(curState = curState, prevState = prevState)
  
    __obj.asInstanceOf[Anon_CurState]
  }
}

