package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLagRequest extends js.Object {
  /**
    * The tags to assign to the child connections of the LAG. Only newly created child connections as the result of creating a LAG connection are assigned the provided tags. The tags are not assigned to an existing connection that is provided via the “connectionId” parameter that will be migrated to the LAG.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of an existing connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth
  /**
    * The name of the LAG.
    */
  var lagName: LagName
  /**
    * The location for the LAG.
    */
  var location: LocationCode
  /**
    * The number of physical connections initially provisioned and bundled by the LAG.
    */
  var numberOfConnections: Count
  /**
    * The tags to assign to the link aggregation group (LAG).
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateLagRequest {
  @scala.inline
  def apply(
    connectionsBandwidth: Bandwidth,
    lagName: LagName,
    location: LocationCode,
    numberOfConnections: Count,
    childConnectionTags: TagList = null,
    connectionId: ConnectionId = null,
    tags: TagList = null
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth, lagName = lagName, location = location, numberOfConnections = numberOfConnections)
    if (childConnectionTags != null) __obj.updateDynamic("childConnectionTags")(childConnectionTags)
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateLagRequest]
  }
}

