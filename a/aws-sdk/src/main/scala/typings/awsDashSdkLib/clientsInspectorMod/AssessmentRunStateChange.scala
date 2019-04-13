package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssessmentRunStateChange extends js.Object {
  /**
    * The assessment run state.
    */
  var state: AssessmentRunState
  /**
    * The last time the assessment run state changed.
    */
  var stateChangedAt: Timestamp
}

object AssessmentRunStateChange {
  @scala.inline
  def apply(state: AssessmentRunState, stateChangedAt: Timestamp): AssessmentRunStateChange = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], stateChangedAt = stateChangedAt)
  
    __obj.asInstanceOf[AssessmentRunStateChange]
  }
}

