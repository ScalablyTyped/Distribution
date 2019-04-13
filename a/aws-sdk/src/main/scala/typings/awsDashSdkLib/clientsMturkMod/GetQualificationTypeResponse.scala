package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQualificationTypeResponse extends js.Object {
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[QualificationType] = js.undefined
}

object GetQualificationTypeResponse {
  @scala.inline
  def apply(QualificationType: QualificationType = null): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (QualificationType != null) __obj.updateDynamic("QualificationType")(QualificationType)
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
}

