package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDomainResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: typings.awsDashSdk.clientsRoute53domainsMod.OperationId
}

object RegisterDomainResponse {
  @scala.inline
  def apply(OperationId: OperationId): RegisterDomainResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId)
  
    __obj.asInstanceOf[RegisterDomainResponse]
  }
}

