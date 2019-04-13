package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopBulkDeploymentRequest extends js.Object {
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: __string
}

object StopBulkDeploymentRequest {
  @scala.inline
  def apply(BulkDeploymentId: __string): StopBulkDeploymentRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId)
  
    __obj.asInstanceOf[StopBulkDeploymentRequest]
  }
}

