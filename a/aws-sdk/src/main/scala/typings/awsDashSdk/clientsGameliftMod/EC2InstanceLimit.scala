package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceLimit extends js.Object {
  /**
    * Number of instances of the specified type that are currently in use by this AWS account.
    */
  var CurrentInstances: js.UndefOr[WholeNumber] = js.native
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var EC2InstanceType: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.EC2InstanceType] = js.native
  /**
    * Number of instances allowed.
    */
  var InstanceLimit: js.UndefOr[WholeNumber] = js.native
}

object EC2InstanceLimit {
  @scala.inline
  def apply(
    CurrentInstances: Int | scala.Double = null,
    EC2InstanceType: EC2InstanceType = null,
    InstanceLimit: Int | scala.Double = null
  ): EC2InstanceLimit = {
    val __obj = js.Dynamic.literal()
    if (CurrentInstances != null) __obj.updateDynamic("CurrentInstances")(CurrentInstances.asInstanceOf[js.Any])
    if (EC2InstanceType != null) __obj.updateDynamic("EC2InstanceType")(EC2InstanceType.asInstanceOf[js.Any])
    if (InstanceLimit != null) __obj.updateDynamic("InstanceLimit")(InstanceLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2InstanceLimit]
  }
}

