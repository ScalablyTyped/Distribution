package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCancelActivityTaskDecisionAttributes extends js.Object {
  /**
    * The activityId of the activity task to be canceled.
    */
  var activityId: ActivityId
}

object RequestCancelActivityTaskDecisionAttributes {
  @scala.inline
  def apply(activityId: ActivityId): RequestCancelActivityTaskDecisionAttributes = {
    val __obj = js.Dynamic.literal(activityId = activityId)
  
    __obj.asInstanceOf[RequestCancelActivityTaskDecisionAttributes]
  }
}

