package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadOperationResponse extends js.Object {
  /**
    * Identifies which operation in a batch has failed.
    */
  var ExceptionResponse: js.UndefOr[BatchReadException] = js.native
  /**
    * Identifies which operation in a batch has succeeded.
    */
  var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.native
}

object BatchReadOperationResponse {
  @scala.inline
  def apply(
    ExceptionResponse: BatchReadException = null,
    SuccessfulResponse: BatchReadSuccessfulResponse = null
  ): BatchReadOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (ExceptionResponse != null) __obj.updateDynamic("ExceptionResponse")(ExceptionResponse.asInstanceOf[js.Any])
    if (SuccessfulResponse != null) __obj.updateDynamic("SuccessfulResponse")(SuccessfulResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadOperationResponse]
  }
}

