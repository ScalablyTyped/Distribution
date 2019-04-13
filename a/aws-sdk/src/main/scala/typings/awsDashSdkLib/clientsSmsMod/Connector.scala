package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connector extends js.Object {
  /**
    * The time the connector was associated.
    */
  var associatedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The capabilities of the connector.
    */
  var capabilityList: js.UndefOr[ConnectorCapabilityList] = js.undefined
  /**
    * The identifier of the connector.
    */
  var connectorId: js.UndefOr[ConnectorId] = js.undefined
  /**
    * The IP address of the connector.
    */
  var ipAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * The MAC address of the connector.
    */
  var macAddress: js.UndefOr[MacAddress] = js.undefined
  /**
    * The status of the connector.
    */
  var status: js.UndefOr[ConnectorStatus] = js.undefined
  /**
    * The connector version.
    */
  var version: js.UndefOr[ConnectorVersion] = js.undefined
  /**
    * The identifier of the VM manager.
    */
  var vmManagerId: js.UndefOr[VmManagerId] = js.undefined
  /**
    * The name of the VM manager.
    */
  var vmManagerName: js.UndefOr[VmManagerName] = js.undefined
  /**
    * The VM management product.
    */
  var vmManagerType: js.UndefOr[VmManagerType] = js.undefined
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
    if (associatedOn != null) __obj.updateDynamic("associatedOn")(associatedOn)
    if (capabilityList != null) __obj.updateDynamic("capabilityList")(capabilityList)
    if (connectorId != null) __obj.updateDynamic("connectorId")(connectorId)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (macAddress != null) __obj.updateDynamic("macAddress")(macAddress)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (vmManagerId != null) __obj.updateDynamic("vmManagerId")(vmManagerId)
    if (vmManagerName != null) __obj.updateDynamic("vmManagerName")(vmManagerName)
    if (vmManagerType != null) __obj.updateDynamic("vmManagerType")(vmManagerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
}

