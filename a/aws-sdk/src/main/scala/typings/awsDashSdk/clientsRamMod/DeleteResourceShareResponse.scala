package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}

object DeleteResourceShareResponse {
  @scala.inline
  def apply(clientToken: String = null, returnValue: js.UndefOr[scala.Boolean] = js.undefined): DeleteResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[DeleteResourceShareResponse]
  }
}

