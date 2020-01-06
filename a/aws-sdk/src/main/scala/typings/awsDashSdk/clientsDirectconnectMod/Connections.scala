package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connections extends js.Object {
  /**
    * The connections.
    */
  var connections: js.UndefOr[ConnectionList] = js.native
}

object Connections {
  @scala.inline
  def apply(connections: ConnectionList = null): Connections = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
}

