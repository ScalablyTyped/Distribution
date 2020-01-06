package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBulkDeploymentRequest extends js.Object {
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: __string = js.native
}

object StopBulkDeploymentRequest {
  @scala.inline
  def apply(BulkDeploymentId: __string): StopBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopBulkDeploymentRequest]
  }
}

