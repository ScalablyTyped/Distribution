package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingGroupRequest extends js.Object {
  /**
    * The name of the thing group.
    */
  var thingGroupName: ThingGroupName
}

object DescribeThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DescribeThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName)
  
    __obj.asInstanceOf[DescribeThingGroupRequest]
  }
}

