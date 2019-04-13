package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connections extends js.Object {
  /**
    * The connections.
    */
  var connections: js.UndefOr[ConnectionList] = js.undefined
}

object Connections {
  @scala.inline
  def apply(connections: ConnectionList = null): Connections = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Connections]
  }
}

