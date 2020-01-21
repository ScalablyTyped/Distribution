package typings.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDraw extends js.Object {
  var draw: js.Any
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  var getPoints: js.UndefOr[js.Any] = js.undefined
}

object AnonDraw {
  @scala.inline
  def apply(draw: js.Any, getMarkerCfg: js.Any = null, getPoints: js.Any = null): AnonDraw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any])
    if (getMarkerCfg != null) __obj.updateDynamic("getMarkerCfg")(getMarkerCfg.asInstanceOf[js.Any])
    if (getPoints != null) __obj.updateDynamic("getPoints")(getPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDraw]
  }
}

