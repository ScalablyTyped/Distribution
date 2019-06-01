package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionState extends js.Object {
  /**
    * A relative local state duration. To get the actual duration of the state
    * relative to the current time, use connection.getStateDuration().
    */
  var duration: scala.Double
  /**
    * The connection state type, as per the ConnectionStateType enumeration.
    */
  var `type`: java.lang.String
}

object ConnectionState {
  @scala.inline
  def apply(duration: scala.Double, `type`: java.lang.String): ConnectionState = {
    val __obj = js.Dynamic.literal(duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionState]
  }
}

