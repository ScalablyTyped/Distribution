package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBulkDeploymentStatusRequest extends js.Object {
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: __string
}

object GetBulkDeploymentStatusRequest {
  @scala.inline
  def apply(BulkDeploymentId: __string): GetBulkDeploymentStatusRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId)
  
    __obj.asInstanceOf[GetBulkDeploymentStatusRequest]
  }
}

