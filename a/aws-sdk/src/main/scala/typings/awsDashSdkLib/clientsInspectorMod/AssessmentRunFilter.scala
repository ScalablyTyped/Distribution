package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentRunFilter extends js.Object {
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the completedAt property of the AssessmentRun data type.
    */
  var completionTimeRange: js.UndefOr[TimestampRange] = js.undefined
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the durationInSeconds property of the AssessmentRun data type.
    */
  var durationRange: js.UndefOr[DurationRange] = js.undefined
  /**
    * For a record to match a filter, an explicit value or a string containing a wildcard that is specified for this data type property must match the value of the assessmentRunName property of the AssessmentRun data type.
    */
  var namePattern: js.UndefOr[NamePattern] = js.undefined
  /**
    * For a record to match a filter, the value that is specified for this data type property must be contained in the list of values of the rulesPackages property of the AssessmentRun data type.
    */
  var rulesPackageArns: js.UndefOr[FilterRulesPackageArnList] = js.undefined
  /**
    * For a record to match a filter, the value that is specified for this data type property must inclusively match any value between the specified minimum and maximum values of the startTime property of the AssessmentRun data type.
    */
  var startTimeRange: js.UndefOr[TimestampRange] = js.undefined
  /**
    * For a record to match a filter, the value that is specified for this data type property must match the stateChangedAt property of the AssessmentRun data type.
    */
  var stateChangeTimeRange: js.UndefOr[TimestampRange] = js.undefined
  /**
    * For a record to match a filter, one of the values specified for this data type property must be the exact match of the value of the assessmentRunState property of the AssessmentRun data type.
    */
  var states: js.UndefOr[AssessmentRunStateList] = js.undefined
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
    if (completionTimeRange != null) __obj.updateDynamic("completionTimeRange")(completionTimeRange)
    if (durationRange != null) __obj.updateDynamic("durationRange")(durationRange)
    if (namePattern != null) __obj.updateDynamic("namePattern")(namePattern)
    if (rulesPackageArns != null) __obj.updateDynamic("rulesPackageArns")(rulesPackageArns)
    if (startTimeRange != null) __obj.updateDynamic("startTimeRange")(startTimeRange)
    if (stateChangeTimeRange != null) __obj.updateDynamic("stateChangeTimeRange")(stateChangeTimeRange)
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[AssessmentRunFilter]
  }
}

