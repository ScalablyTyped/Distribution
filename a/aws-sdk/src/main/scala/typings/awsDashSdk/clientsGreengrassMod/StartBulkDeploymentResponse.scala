package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBulkDeploymentResponse extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[__string] = js.native
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[__string] = js.native
}

object StartBulkDeploymentResponse {
  @scala.inline
  def apply(BulkDeploymentArn: __string = null, BulkDeploymentId: __string = null): StartBulkDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkDeploymentArn != null) __obj.updateDynamic("BulkDeploymentArn")(BulkDeploymentArn.asInstanceOf[js.Any])
    if (BulkDeploymentId != null) __obj.updateDynamic("BulkDeploymentId")(BulkDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBulkDeploymentResponse]
  }
}

