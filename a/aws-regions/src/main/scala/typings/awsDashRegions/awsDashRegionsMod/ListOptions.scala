package typings.awsDashRegions.awsDashRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends js.Object {
  var public: js.UndefOr[Boolean] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(public: js.UndefOr[Boolean] = js.undefined): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

