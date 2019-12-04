package typings.atAntDashDesignProDashLayout.libSettingDrawerThemeColorMod

import typings.atAntDashDesignProDashLayout.Anon_Color
import typings.atAntDashDesignProDashLayout.Anon_DefaultMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColorProps extends js.Object {
  var colors: js.UndefOr[js.Array[Anon_Color]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: String
  def formatMessage(data: Anon_DefaultMessage): String
  def onChange(color: String): Unit
}

object ThemeColorProps {
  @scala.inline
  def apply(
    formatMessage: Anon_DefaultMessage => String,
    onChange: String => Unit,
    value: String,
    colors: js.Array[Anon_Color] = null,
    title: String = null
  ): ThemeColorProps = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColorProps]
  }
}

