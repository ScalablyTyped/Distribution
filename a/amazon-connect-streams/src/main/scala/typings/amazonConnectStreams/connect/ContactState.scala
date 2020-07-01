package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactState extends js.Object {
  /** Indicates when the the contact was put in that state. */
  val timestamp: Date
  /** The contact state type, as per the ContactStateType enumeration. */
  val `type`: ContactStateType
}

object ContactState {
  @scala.inline
  def apply(timestamp: Date, `type`: ContactStateType): ContactState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactState]
  }
}

