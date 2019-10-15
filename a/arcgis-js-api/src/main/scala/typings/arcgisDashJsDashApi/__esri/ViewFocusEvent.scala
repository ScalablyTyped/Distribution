package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewFocusEvent extends js.Object {
  var native: js.Any
  var target: View
}

object ViewFocusEvent {
  @scala.inline
  def apply(native: js.Any, target: View): ViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native, target = target)
  
    __obj.asInstanceOf[ViewFocusEvent]
  }
}

