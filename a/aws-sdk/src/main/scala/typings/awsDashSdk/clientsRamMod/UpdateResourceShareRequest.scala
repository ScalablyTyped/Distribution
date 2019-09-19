package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceShareRequest extends js.Object {
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}

object UpdateResourceShareRequest {
  @scala.inline
  def apply(
    resourceShareArn: String,
    allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined,
    clientToken: String = null,
    name: String = null
  ): UpdateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn)
    if (!js.isUndefined(allowExternalPrincipals)) __obj.updateDynamic("allowExternalPrincipals")(allowExternalPrincipals)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateResourceShareRequest]
  }
}

