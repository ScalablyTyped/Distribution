package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HrefOnClick extends js.Object {
  var href: java.lang.String
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HrefOnClick {
  @scala.inline
  def apply(
    href: java.lang.String,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLAnchorElement] = null,
    target: java.lang.String = null
  ): Anon_HrefOnClick = {
    val __obj = js.Dynamic.literal(href = href)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_HrefOnClick]
  }
}

