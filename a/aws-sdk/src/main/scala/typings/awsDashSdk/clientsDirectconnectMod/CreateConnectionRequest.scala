package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionRequest extends js.Object {
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: Bandwidth = js.native
  /**
    * The name of the connection.
    */
  var connectionName: ConnectionName = js.native
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
  /**
    * The location of the connection.
    */
  var location: LocationCode = js.native
  /**
    * The name of the service provider associated with the requested connection.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
  /**
    * The tags to associate with the lag.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateConnectionRequest {
  @scala.inline
  def apply(
    bandwidth: Bandwidth,
    connectionName: ConnectionName,
    location: LocationCode,
    lagId: LagId = null,
    providerName: ProviderName = null,
    tags: TagList = null
  ): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], connectionName = connectionName.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
}

