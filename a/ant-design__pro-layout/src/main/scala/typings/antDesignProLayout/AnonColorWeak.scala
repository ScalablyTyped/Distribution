package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorWeak extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
}

object AnonColorWeak {
  @scala.inline
  def apply(colorWeak: js.UndefOr[Boolean] = js.undefined, primaryColor: String = null): AnonColorWeak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorWeak]
  }
}

