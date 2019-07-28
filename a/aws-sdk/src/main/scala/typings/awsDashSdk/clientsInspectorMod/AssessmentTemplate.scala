package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTemplate extends js.Object {
  /**
    * The ARN of the assessment template.
    */
  var arn: Arn
  /**
    * The number of existing assessment runs associated with this assessment template. This value can be zero or a positive integer.
    */
  var assessmentRunCount: ArnCount
  /**
    * The ARN of the assessment target that corresponds to this assessment template.
    */
  var assessmentTargetArn: Arn
  /**
    * The time at which the assessment template is created.
    */
  var createdAt: Timestamp
  /**
    * The duration in seconds specified for this assessment template. The default value is 3600 seconds (one hour). The maximum value is 86400 seconds (one day).
    */
  var durationInSeconds: AssessmentRunDuration
  /**
    * The Amazon Resource Name (ARN) of the most recent assessment run associated with this assessment template. This value exists only when the value of assessmentRunCount is greaterpa than zero.
    */
  var lastAssessmentRunArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the assessment template.
    */
  var name: AssessmentTemplateName
  /**
    * The rules packages that are specified for this assessment template.
    */
  var rulesPackageArns: AssessmentTemplateRulesPackageArnList
  /**
    * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this assessment template.
    */
  var userAttributesForFindings: UserAttributeList
}

object AssessmentTemplate {
  @scala.inline
  def apply(
    arn: Arn,
    assessmentRunCount: ArnCount,
    assessmentTargetArn: Arn,
    createdAt: Timestamp,
    durationInSeconds: AssessmentRunDuration,
    name: AssessmentTemplateName,
    rulesPackageArns: AssessmentTemplateRulesPackageArnList,
    userAttributesForFindings: UserAttributeList,
    lastAssessmentRunArn: Arn = null
  ): AssessmentTemplate = {
    val __obj = js.Dynamic.literal(arn = arn, assessmentRunCount = assessmentRunCount, assessmentTargetArn = assessmentTargetArn, createdAt = createdAt, durationInSeconds = durationInSeconds, name = name, rulesPackageArns = rulesPackageArns, userAttributesForFindings = userAttributesForFindings)
    if (lastAssessmentRunArn != null) __obj.updateDynamic("lastAssessmentRunArn")(lastAssessmentRunArn)
    __obj.asInstanceOf[AssessmentTemplate]
  }
}

