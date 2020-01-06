package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRunFilter extends js.Object {
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
    */
  var completionTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.native
  /**
    * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
    */
  var startTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
    */
  var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.native
  /**
    * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
    */
  var states: js.UndefOr[AssessmentRunStateList] = js.native
}

object AssessmentRunFilter {
  @scala.inline
  def apply(
    completionTimeRange: TimestampRange = null,
    durationRange: DurationRange = null,
    namePattern: NamePattern = null,
    rulesPackageArns: FilterRulesPackageArnList = null,
    startTimeRange: TimestampRange = null,
    stateChangeTimeRange: TimestampRange = null,
    states: AssessmentRunStateList = null
  ): AssessmentRunFilter = {
    val __obj = js.Dynamic.literal()
    if (completionTimeRange != null) __obj.updateDynamic("completionTimeRange")(completionTimeRange.asInstanceOf[js.Any])
    if (durationRange != null) __obj.updateDynamic("durationRange")(durationRange.asInstanceOf[js.Any])
    if (namePattern != null) __obj.updateDynamic("namePattern")(namePattern.asInstanceOf[js.Any])
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns.asInstanceOf[js.Any])
    if (startTimeRange != null) __obj.updateDynamic("startTimeRange")(startTimeRange.asInstanceOf[js.Any])
    if (stateChangeTimeRange != null) __obj.updateDynamic("stateChangeTimeRange")(stateChangeTimeRange.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRunFilter]
  }
}

