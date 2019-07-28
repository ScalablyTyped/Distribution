package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateActionTargetResponse extends js.Object {
  /**
    * The ARN for the custom action target.
    */
  var ActionTargetArn: NonEmptyString
}

object CreateActionTargetResponse {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): CreateActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn)
  
    __obj.asInstanceOf[CreateActionTargetResponse]
  }
}

