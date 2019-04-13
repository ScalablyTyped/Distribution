package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedItemDetails extends js.Object {
  /**
    * The status code of a failed item.
    */
  var failureCode: FailedItemErrorCode
  /**
    * Indicates whether you can immediately retry a request for this item for a specified resource.
    */
  var retryable: Bool
}

object FailedItemDetails {
  @scala.inline
  def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
    val __obj = js.Dynamic.literal(failureCode = failureCode.asInstanceOf[js.Any], retryable = retryable)
  
    __obj.asInstanceOf[FailedItemDetails]
  }
}

