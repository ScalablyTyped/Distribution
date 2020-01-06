package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectQualificationRequestRequest extends js.Object {
  /**
    *  The ID of the Qualification request, as returned by the ListQualificationRequests operation. 
    */
  var QualificationRequestId: String = js.native
  /**
    * A text message explaining why the request was rejected, to be shown to the Worker who made the request.
    */
  var Reason: js.UndefOr[String] = js.native
}

object RejectQualificationRequestRequest {
  @scala.inline
  def apply(QualificationRequestId: String, Reason: String = null): RejectQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectQualificationRequestRequest]
  }
}

