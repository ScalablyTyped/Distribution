package typings.atAntvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DrawShape extends js.Object {
  var drawShape: js.Any
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  var getPoints: js.UndefOr[js.Any] = js.undefined
}

object Anon_DrawShape {
  @scala.inline
  def apply(drawShape: js.Any, getMarkerCfg: js.Any = null, getPoints: js.Any = null): Anon_DrawShape = {
    val __obj = js.Dynamic.literal(drawShape = drawShape.asInstanceOf[js.Any])
    if (getMarkerCfg != null) __obj.updateDynamic("getMarkerCfg")(getMarkerCfg.asInstanceOf[js.Any])
    if (getPoints != null) __obj.updateDynamic("getPoints")(getPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DrawShape]
  }
}

