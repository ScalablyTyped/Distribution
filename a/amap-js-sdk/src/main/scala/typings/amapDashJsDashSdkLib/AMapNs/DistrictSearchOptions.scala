package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistrictSearchOptions extends js.Object {
  var extensions: js.UndefOr[java.lang.String] = js.undefined
  var level: java.lang.String
  var showbiz: js.UndefOr[scala.Boolean] = js.undefined
  var subdistrict: js.UndefOr[scala.Double] = js.undefined
}

object DistrictSearchOptions {
  @scala.inline
  def apply(
    level: java.lang.String,
    extensions: java.lang.String = null,
    showbiz: js.UndefOr[scala.Boolean] = js.undefined,
    subdistrict: scala.Int | scala.Double = null
  ): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(showbiz)) __obj.updateDynamic("showbiz")(showbiz)
    if (subdistrict != null) __obj.updateDynamic("subdistrict")(subdistrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
}

