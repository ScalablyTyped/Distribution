package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptQualificationRequestRequest extends js.Object {
  /**
    *  The value of the Qualification. You can omit this value if you are using the presence or absence of the Qualification as the basis for a HIT requirement. 
    */
  var IntegerValue: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the Qualification request, as returned by the GetQualificationRequests operation.
    */
  var QualificationRequestId: String
}

object AcceptQualificationRequestRequest {
  @scala.inline
  def apply(QualificationRequestId: String, IntegerValue: Int | Double = null): AcceptQualificationRequestRequest = {
    val __obj = js.Dynamic.literal(QualificationRequestId = QualificationRequestId)
    if (IntegerValue != null) __obj.updateDynamic("IntegerValue")(IntegerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptQualificationRequestRequest]
  }
}

