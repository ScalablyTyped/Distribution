package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HtmlType extends js.Object {
  var htmlType: js.UndefOr[antdLib.esButtonButtonMod.ButtonHTMLType] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
}

object Anon_HtmlType {
  @scala.inline
  def apply(
    htmlType: antdLib.esButtonButtonMod.ButtonHTMLType = null,
    onClick: reactLib.reactMod.MouseEventHandler[_] = null
  ): Anon_HtmlType = {
    val __obj = js.Dynamic.literal()
    if (htmlType != null) __obj.updateDynamic("htmlType")(htmlType)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[Anon_HtmlType]
  }
}

