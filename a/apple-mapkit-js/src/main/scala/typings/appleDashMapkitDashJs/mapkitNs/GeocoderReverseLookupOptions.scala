package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderReverseLookupOptions extends js.Object {
  var language: js.UndefOr[String] = js.undefined
}

object GeocoderReverseLookupOptions {
  @scala.inline
  def apply(language: String = null): GeocoderReverseLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GeocoderReverseLookupOptions]
  }
}

