package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipointDrawActionDrawCompleteEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
  var vertices: js.Array[js.Array[Double]]
}

object MultipointDrawActionDrawCompleteEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionDrawCompleteEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented, preventDefault = preventDefault, vertices = vertices)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MultipointDrawActionDrawCompleteEvent]
  }
}

