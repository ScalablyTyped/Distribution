package typings
package antdLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionState extends js.Object {
  var focused: scala.Boolean
}

object MentionState {
  @scala.inline
  def apply(focused: scala.Boolean): MentionState = {
    val __obj = js.Dynamic.literal(focused = focused)
  
    __obj.asInstanceOf[MentionState]
  }
}

