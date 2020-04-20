package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMetrics extends js.Object {
  var width: Double
}

object TextMetrics {
  @scala.inline
  def apply(width: Double): TextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
}

