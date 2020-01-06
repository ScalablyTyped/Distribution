package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationDetailRequest extends js.Object {
  /**
    * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in the response to the original request.
    */
  var OperationId: typings.awsDashSdk.clientsRoute53domainsMod.OperationId = js.native
}

object GetOperationDetailRequest {
  @scala.inline
  def apply(OperationId: OperationId): GetOperationDetailRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOperationDetailRequest]
  }
}

