package typings.atAntDashDesignProDashLayout.esFooterMod

import typings.atAntDashDesignProDashLayout.Anon_BlankTarget
import typings.atAntDashDesignProDashLayout.esTypingsMod.WithFalse
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[WithFalse[String]] = js.undefined
  var links: js.UndefOr[WithFalse[js.Array[Anon_BlankTarget]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FooterProps {
  @scala.inline
  def apply(
    className: String = null,
    copyright: WithFalse[String] = null,
    links: WithFalse[js.Array[Anon_BlankTarget]] = null,
    style: CSSProperties = null
  ): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FooterProps]
  }
}

