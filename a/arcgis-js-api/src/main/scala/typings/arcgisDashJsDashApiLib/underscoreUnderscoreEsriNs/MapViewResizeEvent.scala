package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewResizeEvent extends js.Object {
  var height: scala.Double
  var oldHeight: scala.Double
  var oldWidth: scala.Double
  var width: scala.Double
}

object MapViewResizeEvent {
  @scala.inline
  def apply(height: scala.Double, oldHeight: scala.Double, oldWidth: scala.Double, width: scala.Double): MapViewResizeEvent = {
    val __obj = js.Dynamic.literal(height = height, oldHeight = oldHeight, oldWidth = oldWidth, width = width)
  
    __obj.asInstanceOf[MapViewResizeEvent]
  }
}

