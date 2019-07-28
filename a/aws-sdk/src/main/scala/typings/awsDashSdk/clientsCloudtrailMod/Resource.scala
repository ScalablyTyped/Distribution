package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The name of the resource referenced by the event returned. These are user-created names whose values will depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group or "i-1234567" for an EC2 Instance.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  /**
    * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is returned. Some examples of resource types are: Instance for EC2, Trail for CloudTrail, DBInstance for RDS, and AccessKey for IAM. For a list of resource types supported for event lookup, see Resource Types Supported for Event Lookup.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(ResourceName: String = null, ResourceType: String = null): Resource = {
    val __obj = js.Dynamic.literal()
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[Resource]
  }
}

