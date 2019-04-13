package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationDetailRequest extends js.Object {
  /**
    * The identifier for the operation for which you want to get the status. Amazon Route 53 returned the identifier in the response to the original request.
    */
  var OperationId: awsDashSdkLib.clientsRoute53domainsMod.OperationId
}

object GetOperationDetailRequest {
  @scala.inline
  def apply(OperationId: OperationId): GetOperationDetailRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId)
  
    __obj.asInstanceOf[GetOperationDetailRequest]
  }
}

