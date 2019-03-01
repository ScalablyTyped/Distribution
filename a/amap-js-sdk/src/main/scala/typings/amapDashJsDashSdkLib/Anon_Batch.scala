package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Batch extends js.Object {
  var batch: js.UndefOr[scala.Boolean] = js.undefined
  var city: js.UndefOr[java.lang.String] = js.undefined
  var extensions: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Batch {
  @scala.inline
  def apply(
    batch: js.UndefOr[scala.Boolean] = js.undefined,
    city: java.lang.String = null,
    extensions: java.lang.String = null,
    radius: scala.Int | scala.Double = null
  ): Anon_Batch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    if (city != null) __obj.updateDynamic("city")(city)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Batch]
  }
}

