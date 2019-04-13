package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteActivityInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the activity to delete.
    */
  var activityArn: Arn
}

object DeleteActivityInput {
  @scala.inline
  def apply(activityArn: Arn): DeleteActivityInput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn)
  
    __obj.asInstanceOf[DeleteActivityInput]
  }
}

