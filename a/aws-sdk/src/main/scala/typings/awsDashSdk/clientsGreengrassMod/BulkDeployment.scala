package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeployment extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[__string] = js.native
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[__string] = js.native
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[__string] = js.native
}

object BulkDeployment {
  @scala.inline
  def apply(BulkDeploymentArn: __string = null, BulkDeploymentId: __string = null, CreatedAt: __string = null): BulkDeployment = {
    val __obj = js.Dynamic.literal()
    if (BulkDeploymentArn != null) __obj.updateDynamic("BulkDeploymentArn")(BulkDeploymentArn.asInstanceOf[js.Any])
    if (BulkDeploymentId != null) __obj.updateDynamic("BulkDeploymentId")(BulkDeploymentId.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkDeployment]
  }
}

