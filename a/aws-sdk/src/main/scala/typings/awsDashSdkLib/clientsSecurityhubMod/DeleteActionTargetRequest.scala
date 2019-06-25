package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteActionTargetRequest extends js.Object {
  /**
    * The ARN of the custom action target to delete.
    */
  var ActionTargetArn: NonEmptyString
}

object DeleteActionTargetRequest {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn)
  
    __obj.asInstanceOf[DeleteActionTargetRequest]
  }
}

