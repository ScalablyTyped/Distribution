package typings.antd.anchorAnchorMod

import typings.antd.anon.Href
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntAnchor extends js.Object {
  var activeLink: String | Null = js.native
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href, Unit]
  ] = js.native
  def registerLink(link: String): Unit = js.native
  def scrollTo(link: String): Unit = js.native
  def unregisterLink(link: String): Unit = js.native
}

object AntAnchor {
  @scala.inline
  def apply(registerLink: String => Unit, scrollTo: String => Unit, unregisterLink: String => Unit): AntAnchor = {
    val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink))
    __obj.asInstanceOf[AntAnchor]
  }
  @scala.inline
  implicit class AntAnchorOps[Self <: AntAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegisterLink(value: String => Unit): Self = this.set("registerLink", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollTo(value: String => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    @scala.inline
    def setUnregisterLink(value: String => Unit): Self = this.set("unregisterLink", js.Any.fromFunction1(value))
    @scala.inline
    def setActiveLink(value: String): Self = this.set("activeLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveLinkNull: Self = this.set("activeLink", null)
    @scala.inline
    def setOnClick(value: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

