package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlType extends js.Object {
  var htmlType: js.UndefOr[antdLib.libButtonButtonMod.ButtonHTMLType] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLButtonElement]] = js.undefined
}

object Anon_HtmlType {
  @scala.inline
  def apply(
    htmlType: antdLib.libButtonButtonMod.ButtonHTMLType = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLButtonElement] = null
  ): Anon_HtmlType = {
    val __obj = js.Dynamic.literal()
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_HtmlType]
  }
}

