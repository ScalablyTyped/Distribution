package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Unique identifier for a fleet that the instance is in.
    */
  var FleetId: js.UndefOr[FleetId] = js.undefined
  /**
    * Unique identifier for an instance.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * IP address assigned to the instance.
    */
  var IpAddress: js.UndefOr[IpAddress] = js.undefined
  /**
    * Operating system that is running on this instance. 
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  /**
    * Current status of the instance. Possible statuses include the following:    PENDING -- The instance is in the process of being created and launching server processes as defined in the fleet's run-time configuration.     ACTIVE -- The instance has been successfully created and at least one server process has successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now considered ready to host game sessions.     TERMINATING -- The instance is in the process of shutting down. This may happen to reduce capacity during a scaling down event or to recycle resources in the event of a problem.  
    */
  var Status: js.UndefOr[InstanceStatus] = js.undefined
  /**
    * EC2 instance type that defines the computing resources of this instance. 
    */
  var Type: js.UndefOr[EC2InstanceType] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    FleetId: FleetId = null,
    InstanceId: InstanceId = null,
    IpAddress: IpAddress = null,
    OperatingSystem: OperatingSystem = null,
    Status: InstanceStatus = null,
    Type: EC2InstanceType = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

