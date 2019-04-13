package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: Bandwidth
  /**
    * The name of the connection.
    */
  var connectionName: ConnectionName
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  /**
    * The location of the connection.
    */
  var location: LocationCode
}

object CreateConnectionRequest {
  @scala.inline
  def apply(bandwidth: Bandwidth, connectionName: ConnectionName, location: LocationCode, lagId: LagId = null): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth, connectionName = connectionName, location = location)
    if (lagId != null) __obj.updateDynamic("lagId")(lagId)
    __obj.asInstanceOf[CreateConnectionRequest]
  }
}

