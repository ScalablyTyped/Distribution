package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}

object UpdateActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString = null, Name: NonEmptyString = null): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
}

