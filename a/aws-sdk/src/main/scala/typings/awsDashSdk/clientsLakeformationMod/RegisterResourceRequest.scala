package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to register.
    */
  var ResourceArn: ResourceArnString
  /**
    * The identifier for the role.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  /**
    * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog. 
    */
  var UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.undefined
}

object RegisterResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: ResourceArnString,
    RoleArn: IAMRoleArn = null,
    UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.undefined
  ): RegisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (!js.isUndefined(UseServiceLinkedRole)) __obj.updateDynamic("UseServiceLinkedRole")(UseServiceLinkedRole)
    __obj.asInstanceOf[RegisterResourceRequest]
  }
}

