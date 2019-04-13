package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewResultDetail extends js.Object {
  /**
    *  A unique identifier of the Review action result. 
    */
  var ActionId: js.UndefOr[EntityId] = js.undefined
  /**
    *  Key identifies the particular piece of reviewed information. 
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT. 
    */
  var QuestionId: js.UndefOr[EntityId] = js.undefined
  /**
    * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit results about the Assignment itself. 
    */
  var SubjectId: js.UndefOr[EntityId] = js.undefined
  /**
    *  The type of the object from the SubjectId field.
    */
  var SubjectType: js.UndefOr[String] = js.undefined
  /**
    *  The values of Key provided by the review policies you have selected. 
    */
  var Value: js.UndefOr[String] = js.undefined
}

object ReviewResultDetail {
  @scala.inline
  def apply(
    ActionId: EntityId = null,
    Key: String = null,
    QuestionId: EntityId = null,
    SubjectId: EntityId = null,
    SubjectType: String = null,
    Value: String = null
  ): ReviewResultDetail = {
    val __obj = js.Dynamic.literal()
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (QuestionId != null) __obj.updateDynamic("QuestionId")(QuestionId)
    if (SubjectId != null) __obj.updateDynamic("SubjectId")(SubjectId)
    if (SubjectType != null) __obj.updateDynamic("SubjectType")(SubjectType)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ReviewResultDetail]
  }
}

