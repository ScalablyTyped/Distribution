package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to deregister.
    */
  var ResourceArn: ResourceArnString = js.native
}

object DeregisterResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DeregisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterResourceRequest]
  }
}

