package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationTypeResponse extends js.Object {
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typings.awsDashSdk.clientsMturkMod.QualificationType] = js.native
}

object GetQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
}

