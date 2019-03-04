package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AntdMenuThemeDark extends js.Object {
  var antdMenuTheme: js.UndefOr[antdLib.antdLibStrings.dark | antdLib.antdLibStrings.light]
  var inlineCollapsed: js.Any
}

object Anon_AntdMenuThemeDark {
  @scala.inline
  def apply(
    inlineCollapsed: js.Any,
    antdMenuTheme: antdLib.antdLibStrings.dark | antdLib.antdLibStrings.light = null
  ): Anon_AntdMenuThemeDark = {
    val __obj = js.Dynamic.literal(inlineCollapsed = inlineCollapsed)
    if (antdMenuTheme != null) __obj.updateDynamic("antdMenuTheme")(antdMenuTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AntdMenuThemeDark]
  }
}

