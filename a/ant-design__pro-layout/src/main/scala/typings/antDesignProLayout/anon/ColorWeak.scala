package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorWeak extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
}

object ColorWeak {
  @scala.inline
  def apply(colorWeak: js.UndefOr[Boolean] = js.undefined, primaryColor: String = null): ColorWeak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.get.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorWeak]
  }
}

