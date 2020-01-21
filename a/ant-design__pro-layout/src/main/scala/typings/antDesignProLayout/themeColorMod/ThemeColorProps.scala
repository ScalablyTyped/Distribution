package typings.antDesignProLayout.themeColorMod

import typings.antDesignProLayout.AnonColor
import typings.antDesignProLayout.AnonDefaultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorProps extends js.Object {
  var colors: js.UndefOr[js.Array[AnonColor]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: String
  def formatMessage(data: AnonDefaultMessage): String
  def onChange(color: String): Unit
}

object ThemeColorProps {
  @scala.inline
  def apply(
    formatMessage: AnonDefaultMessage => String,
    onChange: String => Unit,
    value: String,
    colors: js.Array[AnonColor] = null,
    title: String = null
  ): ThemeColorProps = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorProps]
  }
}

