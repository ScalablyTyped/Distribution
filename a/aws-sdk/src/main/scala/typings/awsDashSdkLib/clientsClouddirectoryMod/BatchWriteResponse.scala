package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteResponse extends js.Object {
  /**
    * A list of all the responses for each batch write.
    */
  var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
}

object BatchWriteResponse {
  @scala.inline
  def apply(Responses: BatchWriteOperationResponseList = null): BatchWriteResponse = {
    val __obj = js.Dynamic.literal()
    if (Responses != null) __obj.updateDynamic("Responses")(Responses)
    __obj.asInstanceOf[BatchWriteResponse]
  }
}

