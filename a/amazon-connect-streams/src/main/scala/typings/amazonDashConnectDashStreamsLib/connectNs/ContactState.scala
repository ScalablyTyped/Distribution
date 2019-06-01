package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactState extends js.Object {
  /**
    * A relative local state duration. To get the actual duration of the state
    * relative to the current time, use contact.getStateDuration().
    */
  var duration: scala.Double
  /**
    * The contact state type, as per the ContactStateType enumeration.
    */
  var `type`: java.lang.String
}

object ContactState {
  @scala.inline
  def apply(duration: scala.Double, `type`: java.lang.String): ContactState = {
    val __obj = js.Dynamic.literal(duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContactState]
  }
}

