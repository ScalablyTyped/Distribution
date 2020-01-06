package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedNamedQueryId extends js.Object {
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.ErrorCode] = js.native
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.NamedQueryId] = js.native
}

object UnprocessedNamedQueryId {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, NamedQueryId: NamedQueryId = null): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
}

