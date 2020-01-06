package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureException extends js.Object {
  /**
    * Description of the failure.
    */
  var ExceptionDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ExceptionDescription
  ] = js.native
  /**
    * Exception name.
    */
  var ExceptionName: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ExceptionName
  ] = js.native
}

object FailureException {
  @scala.inline
  def apply(ExceptionDescription: ExceptionDescription = null, ExceptionName: ExceptionName = null): FailureException = {
    val __obj = js.Dynamic.literal()
    if (ExceptionDescription != null) __obj.updateDynamic("ExceptionDescription")(ExceptionDescription.asInstanceOf[js.Any])
    if (ExceptionName != null) __obj.updateDynamic("ExceptionName")(ExceptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureException]
  }
}

