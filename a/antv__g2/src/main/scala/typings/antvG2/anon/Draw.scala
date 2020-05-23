package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  var draw: js.Any
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  var getPoints: js.UndefOr[js.Any] = js.undefined
}

object Draw {
  @scala.inline
  def apply(draw: js.Any, getMarkerCfg: js.Any = null, getPoints: js.Any = null): Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any])
    if (getMarkerCfg != null) __obj.updateDynamic("getMarkerCfg")(getMarkerCfg.asInstanceOf[js.Any])
    if (getPoints != null) __obj.updateDynamic("getPoints")(getPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
}

