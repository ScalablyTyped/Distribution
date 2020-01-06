package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[Timestamp] = js.native
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.native
  /**
    * The identifier of the connector.
    */
  var connectorId: js.UndefOr[ConnectorId] = js.native
  /**
    * The IP address of the connector.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The MAC address of the connector.
    */
  var macAddress: js.UndefOr[MacAddress] = js.native
  /**
    * The status of the connector.
    */
  var status: js.UndefOr[ConnectorStatus] = js.native
  /**
    * The connector version.
    */
  var version: js.UndefOr[ConnectorVersion] = js.native
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.native
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.native
  /**
    * The VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.native
}

object Connector {
  @scala.inline
  def apply(
    associatedOn: Timestamp = null,
    capabilityList: ConnectorCapabilityList = null,
    connectorId: ConnectorId = null,
    ipAddress: IpAddress = null,
    macAddress: MacAddress = null,
    status: ConnectorStatus = null,
    version: ConnectorVersion = null,
    vmManagerId: VmManagerId = null,
    vmManagerName: VmManagerName = null,
    vmManagerType: VmManagerType = null
  ): Connector = {
    val __obj = js.Dynamic.literal()
    if (associatedOn != null) __obj.updateDynamic("associatedOn")(associatedOn.asInstanceOf[js.Any])
    if (capabilityList != null) __obj.updateDynamic("capabilityList")(capabilityList.asInstanceOf[js.Any])
    if (connectorId != null) __obj.updateDynamic("connectorId")(connectorId.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vmManagerId != null) __obj.updateDynamic("vmManagerId")(vmManagerId.asInstanceOf[js.Any])
    if (vmManagerName != null) __obj.updateDynamic("vmManagerName")(vmManagerName.asInstanceOf[js.Any])
    if (vmManagerType != null) __obj.updateDynamic("vmManagerType")(vmManagerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

