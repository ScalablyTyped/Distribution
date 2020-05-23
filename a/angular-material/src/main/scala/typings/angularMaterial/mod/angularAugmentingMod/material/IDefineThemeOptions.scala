package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefineThemeOptions extends js.Object {
  var accent: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[Boolean] = js.undefined
  var primary: js.UndefOr[String] = js.undefined
  var warn: js.UndefOr[String] = js.undefined
}

object IDefineThemeOptions {
  @scala.inline
  def apply(
    accent: String = null,
    background: String = null,
    dark: js.UndefOr[Boolean] = js.undefined,
    primary: String = null,
    warn: String = null
  ): IDefineThemeOptions = {
    val __obj = js.Dynamic.literal()
    if (accent != null) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.get.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefineThemeOptions]
  }
}

