package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Batch extends js.Object {
  var batch: js.UndefOr[Boolean] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[String] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object Batch {
  @scala.inline
  def apply(
    batch: js.UndefOr[Boolean] = js.undefined,
    city: String = null,
    extensions: String = null,
    radius: js.UndefOr[Double] = js.undefined
  ): Batch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.get.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
}

