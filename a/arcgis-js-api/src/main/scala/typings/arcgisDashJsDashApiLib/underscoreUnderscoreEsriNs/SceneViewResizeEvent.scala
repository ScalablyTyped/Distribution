package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewResizeEvent extends js.Object {
  var height: scala.Double
  var oldHeight: scala.Double
  var oldWidth: scala.Double
  var width: scala.Double
}

object SceneViewResizeEvent {
  @scala.inline
  def apply(height: scala.Double, oldHeight: scala.Double, oldWidth: scala.Double, width: scala.Double): SceneViewResizeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("oldHeight")(oldHeight)
    __obj.updateDynamic("oldWidth")(oldWidth)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SceneViewResizeEvent]
  }
}

