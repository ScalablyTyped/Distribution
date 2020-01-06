package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The ARN of a resource.
    */
  var ResourceArn: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.ResourceArn] = js.native
  /**
    * The resource type of a resource, such as AWS::EC2::Instance.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.ResourceType] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(ResourceArn: ResourceArn = null, ResourceType: ResourceType = null): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

