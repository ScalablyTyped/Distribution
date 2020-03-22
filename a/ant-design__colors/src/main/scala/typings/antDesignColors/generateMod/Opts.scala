package typings.antDesignColors.generateMod

import typings.antDesignColors.antDesignColorsStrings.dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[dark | typings.antDesignColors.antDesignColorsStrings.default] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    theme: dark | typings.antDesignColors.antDesignColorsStrings.default = null
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

