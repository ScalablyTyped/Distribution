package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString = js.native
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}

object UpdateActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString = null, Name: NonEmptyString = null): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
}

