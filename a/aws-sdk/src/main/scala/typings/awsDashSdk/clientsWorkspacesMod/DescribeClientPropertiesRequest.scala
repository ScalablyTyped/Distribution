package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientPropertiesRequest extends js.Object {
  /**
    * The resource identifier, in the form of directory IDs.
    */
  var ResourceIds: ResourceIdList
}

object DescribeClientPropertiesRequest {
  @scala.inline
  def apply(ResourceIds: ResourceIdList): DescribeClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceIds = ResourceIds)
  
    __obj.asInstanceOf[DescribeClientPropertiesRequest]
  }
}

