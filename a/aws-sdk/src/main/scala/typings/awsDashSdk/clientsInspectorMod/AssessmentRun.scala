package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentRun extends js.Object {
  /**
    * The ARN of the assessment run.
    */
  var arn: Arn
  /**
    * The ARN of the assessment template that is associated with the assessment run.
    */
  var assessmentTemplateArn: Arn
  /**
    * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
    */
  var completedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time when StartAssessmentRun was called.
    */
  var createdAt: Timestamp
  /**
    * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
    */
  var dataCollected: Bool
  /**
    * The duration of the assessment run.
    */
  var durationInSeconds: AssessmentRunDuration
  /**
    * Provides a total count of generated findings per severity.
    */
  var findingCounts: AssessmentRunFindingCounts
  /**
    * The auto-generated name for the assessment run.
    */
  var name: AssessmentRunName
  /**
    * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
    */
  var notifications: AssessmentRunNotificationList
  /**
    * The rules packages selected for the assessment run.
    */
  var rulesPackageArns: AssessmentRulesPackageArnList
  /**
    * The time when StartAssessmentRun was called.
    */
  var startedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The state of the assessment run.
    */
  var state: AssessmentRunState
  /**
    * The last time when the assessment run's state changed.
    */
  var stateChangedAt: Timestamp
  /**
    * A list of the assessment run state changes.
    */
  var stateChanges: AssessmentRunStateChangeList
  /**
    * The user-defined attributes that are assigned to every generated finding.
    */
  var userAttributesForFindings: UserAttributeList
}

object AssessmentRun {
  @scala.inline
  def apply(
    arn: Arn,
    assessmentTemplateArn: Arn,
    createdAt: Timestamp,
    dataCollected: Bool,
    durationInSeconds: AssessmentRunDuration,
    findingCounts: AssessmentRunFindingCounts,
    name: AssessmentRunName,
    notifications: AssessmentRunNotificationList,
    rulesPackageArns: AssessmentRulesPackageArnList,
    state: AssessmentRunState,
    stateChangedAt: Timestamp,
    stateChanges: AssessmentRunStateChangeList,
    userAttributesForFindings: UserAttributeList,
    completedAt: Timestamp = null,
    startedAt: Timestamp = null
  ): AssessmentRun = {
    val __obj = js.Dynamic.literal(arn = arn, assessmentTemplateArn = assessmentTemplateArn, createdAt = createdAt, dataCollected = dataCollected, durationInSeconds = durationInSeconds, findingCounts = findingCounts, name = name, notifications = notifications, rulesPackageArns = rulesPackageArns, state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt, stateChanges = stateChanges, userAttributesForFindings = userAttributesForFindings)
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt)
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt)
    __obj.asInstanceOf[AssessmentRun]
  }
}

