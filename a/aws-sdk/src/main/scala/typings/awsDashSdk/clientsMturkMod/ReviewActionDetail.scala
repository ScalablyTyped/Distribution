package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewActionDetail extends js.Object {
  /**
    * The unique identifier for the action.
    */
  var ActionId: js.UndefOr[EntityId] = js.undefined
  /**
    *  The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting results, and deciding which other actions will be necessary. 
    */
  var ActionName: js.UndefOr[String] = js.undefined
  /**
    *  The date when the action was completed.
    */
  var CompleteTime: js.UndefOr[Timestamp] = js.undefined
  /**
    *  Present only when the Results have a FAILED Status.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    *  A description of the outcome of the review.
    */
  var Result: js.UndefOr[String] = js.undefined
  /**
    *  The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED. 
    */
  var Status: js.UndefOr[ReviewActionStatus] = js.undefined
  /**
    *  The specific HITId or AssignmentID targeted by the action.
    */
  var TargetId: js.UndefOr[EntityId] = js.undefined
  /**
    *  The type of object in TargetId.
    */
  var TargetType: js.UndefOr[String] = js.undefined
}

object ReviewActionDetail {
  @scala.inline
  def apply(
    ActionId: EntityId = null,
    ActionName: String = null,
    CompleteTime: Timestamp = null,
    ErrorCode: String = null,
    Result: String = null,
    Status: ReviewActionStatus = null,
    TargetId: EntityId = null,
    TargetType: String = null
  ): ReviewActionDetail = {
    val __obj = js.Dynamic.literal()
    if (ActionId != null) __obj.updateDynamic("ActionId")(ActionId)
    if (ActionName != null) __obj.updateDynamic("ActionName")(ActionName)
    if (CompleteTime != null) __obj.updateDynamic("CompleteTime")(CompleteTime)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    __obj.asInstanceOf[ReviewActionDetail]
  }
}

