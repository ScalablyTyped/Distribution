package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAssignmentResponse extends js.Object {
  /**
    *  The assignment. The response includes one Assignment element. 
    */
  var Assignment: js.UndefOr[Assignment] = js.undefined
  /**
    *  The HIT associated with this assignment. The response includes one HIT element.
    */
  var HIT: js.UndefOr[HIT] = js.undefined
}

object GetAssignmentResponse {
  @scala.inline
  def apply(Assignment: Assignment = null, HIT: HIT = null): GetAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Assignment != null) __obj.updateDynamic("Assignment")(Assignment)
    if (HIT != null) __obj.updateDynamic("HIT")(HIT)
    __obj.asInstanceOf[GetAssignmentResponse]
  }
}

