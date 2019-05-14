package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderReverseLookupOptions extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
}

object GeocoderReverseLookupOptions {
  @scala.inline
  def apply(language: java.lang.String = null): GeocoderReverseLookupOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[GeocoderReverseLookupOptions]
  }
}

