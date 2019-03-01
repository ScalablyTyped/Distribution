package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultType extends js.Object {
  var defaultType: js.UndefOr[scala.Double] = js.undefined
  var showRoad: js.UndefOr[scala.Boolean] = js.undefined
  var showTraffic: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DefaultType {
  @scala.inline
  def apply(
    defaultType: scala.Int | scala.Double = null,
    showRoad: js.UndefOr[scala.Boolean] = js.undefined,
    showTraffic: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DefaultType = {
    val __obj = js.Dynamic.literal()
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoad)) __obj.updateDynamic("showRoad")(showRoad)
    if (!js.isUndefined(showTraffic)) __obj.updateDynamic("showTraffic")(showTraffic)
    __obj.asInstanceOf[Anon_DefaultType]
  }
}

