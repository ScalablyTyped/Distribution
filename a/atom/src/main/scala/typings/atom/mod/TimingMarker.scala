package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingMarker extends js.Object {
  var label: String
  var time: Double
}

object TimingMarker {
  @scala.inline
  def apply(label: String, time: Double): TimingMarker = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingMarker]
  }
}

