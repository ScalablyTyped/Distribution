package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateActivityOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the created activity.
    */
  var activityArn: Arn
  /**
    * The date the activity is created.
    */
  var creationDate: Timestamp
}

object CreateActivityOutput {
  @scala.inline
  def apply(activityArn: Arn, creationDate: Timestamp): CreateActivityOutput = {
    val __obj = js.Dynamic.literal(activityArn = activityArn, creationDate = creationDate)
  
    __obj.asInstanceOf[CreateActivityOutput]
  }
}

