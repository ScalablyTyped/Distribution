package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentRun extends js.Object {
  /**
    * The ARN of the assessment run.
    */
  var arn: Arn = js.native
  /**
    * The ARN of the assessment template that is associated with the assessment run.
    */
  var assessmentTemplateArn: Arn = js.native
  /**
    * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
    */
  var completedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var createdAt: Timestamp = js.native
  /**
    * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is completed.
    */
  var dataCollected: Bool = js.native
  /**
    * The duration of the assessment run.
    */
  var durationInSeconds: AssessmentRunDuration = js.native
  /**
    * Provides a total count of generated findings per severity.
    */
  var findingCounts: AssessmentRunFindingCounts = js.native
  /**
    * The auto-generated name for the assessment run.
    */
  var name: AssessmentRunName = js.native
  /**
    * A list of notifications for the event subscriptions. A notification about a particular generated finding is added to this list only once.
    */
  var notifications: AssessmentRunNotificationList = js.native
  /**
    * The rules packages selected for the assessment run.
    */
  var rulesPackageArns: AssessmentRulesPackageArnList = js.native
  /**
    * The time when StartAssessmentRun was called.
    */
  var startedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The state of the assessment run.
    */
  var state: AssessmentRunState = js.native
  /**
    * The last time when the assessment run's state changed.
    */
  var stateChangedAt: Timestamp = js.native
  /**
    * A list of the assessment run state changes.
    */
  var stateChanges: AssessmentRunStateChangeList = js.native
  /**
    * The user-defined attributes that are assigned to every generated finding.
    */
  var userAttributesForFindings: UserAttributeList = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], dataCollected = dataCollected.asInstanceOf[js.Any], durationInSeconds = durationInSeconds.asInstanceOf[js.Any], findingCounts = findingCounts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], rulesPackageArns = rulesPackageArns.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt.asInstanceOf[js.Any], stateChanges = stateChanges.asInstanceOf[js.Any], userAttributesForFindings = userAttributesForFindings.asInstanceOf[js.Any])
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentRun]
  }
}

