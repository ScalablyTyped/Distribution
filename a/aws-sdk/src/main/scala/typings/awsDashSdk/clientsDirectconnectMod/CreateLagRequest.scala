package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLagRequest extends js.Object {
  /**
    * The tags to associate with the automtically created LAGs.
    */
  var childConnectionTags: js.UndefOr[TagList] = js.native
  /**
    * The ID of an existing connection to migrate to the LAG.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.native
  /**
    * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps. 
    */
  var connectionsBandwidth: Bandwidth = js.native
  /**
    * The name of the LAG.
    */
  var lagName: LagName = js.native
  /**
    * The location for the LAG.
    */
  var location: LocationCode = js.native
  /**
    * The number of physical connections initially provisioned and bundled by the LAG.
    */
  var numberOfConnections: Count = js.native
  /**
    * The name of the service provider associated with the LAG.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the LAG.
    */
  var tags: js.UndefOr[TagList] = js.native
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
    providerName: ProviderName = null,
    tags: TagList = null
  ): CreateLagRequest = {
    val __obj = js.Dynamic.literal(connectionsBandwidth = connectionsBandwidth.asInstanceOf[js.Any], lagName = lagName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], numberOfConnections = numberOfConnections.asInstanceOf[js.Any])
    if (childConnectionTags != null) __obj.updateDynamic("childConnectionTags")(childConnectionTags.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLagRequest]
  }
}

