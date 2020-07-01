package typings.amazonConnectStreams.connect

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionState extends js.Object {
  /** A `Date` object that indicates when the the connection was put in that state. */
  val timestamp: Date
  /** The connection state type, as per the `ConnectionStateType` enumeration. */
  val `type`: ConnectionStateType
}

object ConnectionState {
  @scala.inline
  def apply(timestamp: Date, `type`: ConnectionStateType): ConnectionState = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
}

