package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOperationRequest extends js.Object {
  /**
    * A GUID used to identify the operation.
    */
  var operationId: NonEmptyString
}

object GetOperationRequest {
  @scala.inline
  def apply(operationId: NonEmptyString): GetOperationRequest = {
    val __obj = js.Dynamic.literal(operationId = operationId)
  
    __obj.asInstanceOf[GetOperationRequest]
  }
}

