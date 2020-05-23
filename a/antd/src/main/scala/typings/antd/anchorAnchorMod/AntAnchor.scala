package typings.antd.anchorAnchorMod

import typings.antd.anon.Href
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntAnchor extends js.Object {
  var activeLink: String | Null
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href, Unit]
  ] = js.undefined
  def registerLink(link: String): Unit
  def scrollTo(link: String): Unit
  def unregisterLink(link: String): Unit
}

object AntAnchor {
  @scala.inline
  def apply(
    registerLink: String => Unit,
    scrollTo: String => Unit,
    unregisterLink: String => Unit,
    activeLink: String = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href) => Unit = null
  ): AntAnchor = {
    val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink), activeLink = activeLink.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[AntAnchor]
  }
}

