package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentTarget extends js.Object {
  /**
    * The ARN that specifies the Amazon Inspector assessment target.
    */
  var arn: Arn
  /**
    * The time at which the assessment target is created.
    */
  var createdAt: Timestamp
  /**
    * The name of the Amazon Inspector assessment target.
    */
  var name: AssessmentTargetName
  /**
    * The ARN that specifies the resource group that is associated with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * The time at which UpdateAssessmentTarget is called.
    */
  var updatedAt: Timestamp
}

object AssessmentTarget {
  @scala.inline
  def apply(
    arn: Arn,
    createdAt: Timestamp,
    name: AssessmentTargetName,
    updatedAt: Timestamp,
    resourceGroupArn: Arn = null
  ): AssessmentTarget = {
    val __obj = js.Dynamic.literal(arn = arn, createdAt = createdAt, name = name, updatedAt = updatedAt)
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn)
    __obj.asInstanceOf[AssessmentTarget]
  }
}

