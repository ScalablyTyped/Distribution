package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAccess extends js.Object {
  /**
    * Credentials required to access the instance.
    */
  var Credentials: js.UndefOr[InstanceCredentials] = js.undefined
  /**
    * Unique identifier for a fleet containing the instance being accessed.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
  /**
    * Unique identifier for an instance being accessed.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * IP address assigned to the instance.
    */
  var IpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * Operating system that is running on the instance.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
}

object InstanceAccess {
  @scala.inline
  def apply(
    Credentials: InstanceCredentials = null,
    FleetId: FleetId = null,
    InstanceId: InstanceId = null,
    IpAddress: IpAddress = null,
    OperatingSystem: OperatingSystem = null
  ): InstanceAccess = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAccess]
  }
}

