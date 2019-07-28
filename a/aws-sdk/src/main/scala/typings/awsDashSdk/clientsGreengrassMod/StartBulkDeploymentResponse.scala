package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBulkDeploymentResponse extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[__string] = js.undefined
}

object StartBulkDeploymentResponse {
  @scala.inline
  def apply(BulkDeploymentArn: __string = null, BulkDeploymentId: __string = null): StartBulkDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    if (BulkDeploymentArn != null) __obj.updateDynamic("BulkDeploymentArn")(BulkDeploymentArn)
    if (BulkDeploymentId != null) __obj.updateDynamic("BulkDeploymentId")(BulkDeploymentId)
    __obj.asInstanceOf[StartBulkDeploymentResponse]
  }
}

