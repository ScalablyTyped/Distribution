package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteActionTargetResponse extends js.Object {
  /**
    * The ARN of the custom action target that was deleted.
    */
  var ActionTargetArn: NonEmptyString
}

object DeleteActionTargetResponse {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn)
  
    __obj.asInstanceOf[DeleteActionTargetResponse]
  }
}

