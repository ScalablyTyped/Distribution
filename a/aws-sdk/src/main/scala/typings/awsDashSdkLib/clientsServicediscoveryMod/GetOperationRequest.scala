package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationRequest extends js.Object {
  /**
    * The ID of the operation that you want to get more information about.
    */
  var OperationId: ResourceId
}

object GetOperationRequest {
  @scala.inline
  def apply(OperationId: ResourceId): GetOperationRequest = {
    val __obj = js.Dynamic.literal(OperationId = OperationId)
  
    __obj.asInstanceOf[GetOperationRequest]
  }
}

