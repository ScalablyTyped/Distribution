package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceCount extends js.Object {
  /**
    * The number of resources.
    */
  var count: js.UndefOr[Long] = js.undefined
  /**
    * The resource type (for example, "AWS::EC2::Instance").
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}

object ResourceCount {
  @scala.inline
  def apply(count: Int | Double = null, resourceType: ResourceType = null): ResourceCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCount]
  }
}

