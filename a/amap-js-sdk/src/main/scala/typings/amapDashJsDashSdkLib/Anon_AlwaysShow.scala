package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysShow extends js.Object {
  var alwaysShow: js.UndefOr[scala.Boolean] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var hideFloorBar: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AlwaysShow {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: java.lang.String = null,
    hideFloorBar: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): Anon_AlwaysShow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(hideFloorBar)) __obj.updateDynamic("hideFloorBar")(hideFloorBar)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlwaysShow]
  }
}

