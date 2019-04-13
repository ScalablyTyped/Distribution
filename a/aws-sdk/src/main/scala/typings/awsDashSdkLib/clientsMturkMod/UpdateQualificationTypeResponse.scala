package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQualificationTypeResponse extends js.Object {
  /**
    *  Contains a QualificationType data structure.
    */
  var QualificationType: js.UndefOr[QualificationType] = js.undefined
}

object UpdateQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): UpdateQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType)
    __obj.asInstanceOf[UpdateQualificationTypeResponse]
  }
}

