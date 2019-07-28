package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsConstructorOptions extends js.Object {
  var language: js.UndefOr[String] = js.undefined
}

object DirectionsConstructorOptions {
  @scala.inline
  def apply(language: String = null): DirectionsConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[DirectionsConstructorOptions]
  }
}

