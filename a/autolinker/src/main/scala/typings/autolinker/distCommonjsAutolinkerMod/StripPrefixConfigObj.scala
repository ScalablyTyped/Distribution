package typings.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripPrefixConfigObj extends js.Object {
  var scheme: js.UndefOr[Boolean] = js.undefined
  var www: js.UndefOr[Boolean] = js.undefined
}

object StripPrefixConfigObj {
  @scala.inline
  def apply(scheme: js.UndefOr[Boolean] = js.undefined, www: js.UndefOr[Boolean] = js.undefined): StripPrefixConfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scheme)) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (!js.isUndefined(www)) __obj.updateDynamic("www")(www.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripPrefixConfigObj]
  }
}

