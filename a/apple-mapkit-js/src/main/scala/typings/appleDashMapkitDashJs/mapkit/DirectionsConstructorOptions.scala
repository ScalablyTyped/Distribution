package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that you may provide when creating a directions object.
  */
trait DirectionsConstructorOptions extends js.Object {
  /**
    * A language ID that determines the language for route information.
    */
  var language: js.UndefOr[String] = js.undefined
}

object DirectionsConstructorOptions {
  @scala.inline
  def apply(language: String = null): DirectionsConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsConstructorOptions]
  }
}

