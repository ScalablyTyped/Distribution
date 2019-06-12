package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurState extends js.Object {
  /** The current connection state. */
  var curState: java.lang.String
  /**  The previous connection state. */
  var prevState: java.lang.String
}

object Anon_CurState {
  @scala.inline
  def apply(curState: java.lang.String, prevState: java.lang.String): Anon_CurState = {
    val __obj = js.Dynamic.literal(curState = curState, prevState = prevState)
  
    __obj.asInstanceOf[Anon_CurState]
  }
}

