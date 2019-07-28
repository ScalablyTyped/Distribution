package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateResourceShareRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}

object AssociateResourceShareRequest {
  @scala.inline
  def apply(
    resourceShareArn: String,
    clientToken: String = null,
    principals: PrincipalArnOrIdList = null,
    resourceArns: ResourceArnList = null
  ): AssociateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns)
    __obj.asInstanceOf[AssociateResourceShareRequest]
  }
}

