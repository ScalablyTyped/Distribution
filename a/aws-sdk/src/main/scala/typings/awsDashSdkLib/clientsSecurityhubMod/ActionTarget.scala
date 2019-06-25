package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionTarget extends js.Object {
  /**
    * The ARN for the target action.
    */
  var ActionTargetArn: NonEmptyString
  /**
    * The description of the target action.
    */
  var Description: NonEmptyString
  /**
    * The name of the action target.
    */
  var Name: NonEmptyString
}

object ActionTarget {
  @scala.inline
  def apply(ActionTargetArn: NonEmptyString, Description: NonEmptyString, Name: NonEmptyString): ActionTarget = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn, Description = Description, Name = Name)
  
    __obj.asInstanceOf[ActionTarget]
  }
}

