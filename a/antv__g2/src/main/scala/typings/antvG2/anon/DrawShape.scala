package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawShape extends js.Object {
  var drawShape: js.Any
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  var getPoints: js.UndefOr[js.Any] = js.undefined
}

object DrawShape {
  @scala.inline
  def apply(drawShape: js.Any, getMarkerCfg: js.Any = null, getPoints: js.Any = null): DrawShape = {
    val __obj = js.Dynamic.literal(drawShape = drawShape.asInstanceOf[js.Any])
    if (getMarkerCfg != null) __obj.updateDynamic("getMarkerCfg")(getMarkerCfg.asInstanceOf[js.Any])
    if (getPoints != null) __obj.updateDynamic("getPoints")(getPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawShape]
  }
}

