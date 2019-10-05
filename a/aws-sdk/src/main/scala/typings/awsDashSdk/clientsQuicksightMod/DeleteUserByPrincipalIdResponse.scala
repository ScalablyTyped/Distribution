package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserByPrincipalIdResponse extends js.Object {
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}

object DeleteUserByPrincipalIdResponse {
  @scala.inline
  def apply(RequestId: String = null, Status: Int | Double = null): DeleteUserByPrincipalIdResponse = {
    val __obj = js.Dynamic.literal()
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserByPrincipalIdResponse]
  }
}

