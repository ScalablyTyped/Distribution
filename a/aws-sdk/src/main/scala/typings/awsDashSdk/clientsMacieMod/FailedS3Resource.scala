package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedS3Resource extends js.Object {
  /**
    * The status code of a failed item.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The error message of a failed item.
    */
  var errorMessage: js.UndefOr[ExceptionMessage] = js.undefined
  /**
    * The failed S3 resources.
    */
  var failedItem: js.UndefOr[S3Resource] = js.undefined
}

object FailedS3Resource {
  @scala.inline
  def apply(errorCode: ErrorCode = null, errorMessage: ExceptionMessage = null, failedItem: S3Resource = null): FailedS3Resource = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (failedItem != null) __obj.updateDynamic("failedItem")(failedItem)
    __obj.asInstanceOf[FailedS3Resource]
  }
}

