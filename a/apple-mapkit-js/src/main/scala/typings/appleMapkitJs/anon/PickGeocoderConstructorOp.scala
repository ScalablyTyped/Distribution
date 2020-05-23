package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apple-mapkit-js.mapkit.GeocoderConstructorOptions, 'language'> */
trait PickGeocoderConstructorOp extends js.Object {
  var language: js.UndefOr[String] = js.undefined
}

object PickGeocoderConstructorOp {
  @scala.inline
  def apply(language: String = null): PickGeocoderConstructorOp = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickGeocoderConstructorOp]
  }
}

