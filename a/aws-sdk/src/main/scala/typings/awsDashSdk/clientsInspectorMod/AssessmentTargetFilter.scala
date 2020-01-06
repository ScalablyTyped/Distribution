package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTargetFilter extends js.Object {
  /**
    * For a record to match a filter, an explicit value or a string that contains a wildcard that is specified for this data type property must match the value of the assessmentTargetName property of the AssessmentTarget data type.
    */
  var assessmentTargetNamePattern: js.UndefOr[NamePattern] = js.native
}

object AssessmentTargetFilter {
  @scala.inline
  def apply(assessmentTargetNamePattern: NamePattern = null): AssessmentTargetFilter = {
    val __obj = js.Dynamic.literal()
    if (assessmentTargetNamePattern != null) __obj.updateDynamic("assessmentTargetNamePattern")(assessmentTargetNamePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTargetFilter]
  }
}

