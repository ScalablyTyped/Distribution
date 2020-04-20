package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewLines extends js.Object {
  var newLines: Double
  var newStart: Double
  var oldLines: Double
  var oldStart: Double
}

object AnonNewLines {
  @scala.inline
  def apply(newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): AnonNewLines = {
    val __obj = js.Dynamic.literal(newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewLines]
  }
}

