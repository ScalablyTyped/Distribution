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
  def apply(count: js.UndefOr[Long] = js.undefined, resourceType: ResourceType = null): ResourceCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCount]
  }
}

