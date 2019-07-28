package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQualificationTypeResponse extends js.Object {
  /**
    * The created Qualification type, returned as a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[typings.awsDashSdk.clientsMturkMod.QualificationType] = js.undefined
}

object CreateQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): CreateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType)
    __obj.asInstanceOf[CreateQualificationTypeResponse]
  }
}

