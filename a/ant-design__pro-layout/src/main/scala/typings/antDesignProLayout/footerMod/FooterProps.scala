package typings.antDesignProLayout.footerMod

import typings.antDesignProLayout.AnonBlankTarget
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[WithFalse[String]] = js.undefined
  var links: js.UndefOr[WithFalse[js.Array[AnonBlankTarget]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FooterProps {
  @scala.inline
  def apply(
    className: String = null,
    copyright: WithFalse[String] = null,
    links: WithFalse[js.Array[AnonBlankTarget]] = null,
    style: CSSProperties = null
  ): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps]
  }
}

