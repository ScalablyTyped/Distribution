package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceShareRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}

object DeleteResourceShareRequest {
  @scala.inline
  def apply(resourceShareArn: String, clientToken: String = null): DeleteResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn)
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    __obj.asInstanceOf[DeleteResourceShareRequest]
  }
}

