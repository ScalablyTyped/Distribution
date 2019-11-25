package typings.amapDashJsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Batch extends js.Object {
  var batch: js.UndefOr[Boolean] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object Anon_Batch {
  @scala.inline
  def apply(
    batch: js.UndefOr[Boolean] = js.undefined,
    city: String = null,
    extensions: String = null,
    radius: Int | Double = null
  ): Anon_Batch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Batch]
  }
}

