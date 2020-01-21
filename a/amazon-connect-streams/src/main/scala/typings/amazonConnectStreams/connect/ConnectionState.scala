package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionState extends js.Object {
  /**
    * A relative local state duration. To get the actual duration of the state
    * relative to the current time, use connection.getStateDuration().
    */
  var duration: Double
  /**
    * The connection state type, as per the ConnectionStateType enumeration.
    */
  var `type`: String
}

object ConnectionState {
  @scala.inline
  def apply(duration: Double, `type`: String): ConnectionState = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionState]
  }
}

