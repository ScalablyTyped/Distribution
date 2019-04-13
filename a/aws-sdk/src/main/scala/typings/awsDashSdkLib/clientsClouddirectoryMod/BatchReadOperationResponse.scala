package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadOperationResponse extends js.Object {
  /**
    * Identifies which operation in a batch has failed.
    */
  var ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined
  /**
    * Identifies which operation in a batch has succeeded.
    */
  var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined
}

object BatchReadOperationResponse {
  @scala.inline
  def apply(
    ExceptionResponse: BatchReadException = null,
    SuccessfulResponse: BatchReadSuccessfulResponse = null
  ): BatchReadOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (ExceptionResponse != null) __obj.updateDynamic("ExceptionResponse")(ExceptionResponse)
    if (SuccessfulResponse != null) __obj.updateDynamic("SuccessfulResponse")(SuccessfulResponse)
    __obj.asInstanceOf[BatchReadOperationResponse]
  }
}

