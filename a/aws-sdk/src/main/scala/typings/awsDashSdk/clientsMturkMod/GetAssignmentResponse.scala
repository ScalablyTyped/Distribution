package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssignmentResponse extends js.Object {
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[typings.awsDashSdk.clientsMturkMod.Assignment] = js.native
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[typings.awsDashSdk.clientsMturkMod.HIT] = js.native
}

object GetAssignmentResponse {
  @scala.inline
  def apply(Assignment: Assignment = null, HIT: HIT = null): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Assignment != null) __obj.updateDynamic("Assignment")(Assignment.asInstanceOf[js.Any])
    if (HIT != null) __obj.updateDynamic("HIT")(HIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssignmentResponse]
  }
}

