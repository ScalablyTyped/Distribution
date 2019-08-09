package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString
  /**
    * The new role to use for the given resource registered in AWS Lake Formation.
    */
  var RoleArn: IAMRoleArn
}

object UpdateResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString, RoleArn: IAMRoleArn): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, RoleArn = RoleArn)
  
    __obj.asInstanceOf[UpdateResourceRequest]
  }
}

