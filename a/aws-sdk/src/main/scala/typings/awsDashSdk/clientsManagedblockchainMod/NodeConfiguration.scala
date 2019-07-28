package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeConfiguration extends js.Object {
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: AvailabilityZoneString
  /**
    * The Amazon Managed Blockchain instance type for the node.
    */
  var InstanceType: InstanceTypeString
}

object NodeConfiguration {
  @scala.inline
  def apply(AvailabilityZone: AvailabilityZoneString, InstanceType: InstanceTypeString): NodeConfiguration = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone, InstanceType = InstanceType)
  
    __obj.asInstanceOf[NodeConfiguration]
  }
}

