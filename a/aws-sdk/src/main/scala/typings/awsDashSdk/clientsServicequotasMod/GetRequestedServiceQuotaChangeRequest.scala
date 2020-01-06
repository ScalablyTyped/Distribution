package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestedServiceQuotaChangeRequest extends js.Object {
  /**
    * Identifies the quota increase request.
    */
  var RequestId: typings.awsDashSdk.clientsServicequotasMod.RequestId = js.native
}

object GetRequestedServiceQuotaChangeRequest {
  @scala.inline
  def apply(RequestId: RequestId): GetRequestedServiceQuotaChangeRequest = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
  }
}

