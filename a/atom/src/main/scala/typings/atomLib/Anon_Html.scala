package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var keyBindingCommand: js.UndefOr[java.lang.String] = js.undefined
  var keyBindingTarget: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var title: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
}

object Anon_Html {
  @scala.inline
  def apply(
    html: js.UndefOr[scala.Boolean] = js.undefined,
    keyBindingCommand: java.lang.String = null,
    keyBindingTarget: stdLib.HTMLElement = null,
    title: java.lang.String | js.Function0[java.lang.String] = null
  ): Anon_Html = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (keyBindingCommand != null) __obj.updateDynamic("keyBindingCommand")(keyBindingCommand)
    if (keyBindingTarget != null) __obj.updateDynamic("keyBindingTarget")(keyBindingTarget)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Html]
  }
}

