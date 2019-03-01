package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMetrics extends js.Object {
  var width: scala.Double
}

object TextMetrics {
  @scala.inline
  def apply(width: scala.Double): TextMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TextMetrics]
  }
}

