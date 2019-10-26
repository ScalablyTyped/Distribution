package typings.atAntDashDesignProDashLayout.libFooterMod

import typings.atAntDashDesignProDashLayout.Anon_BlankTarget
import typings.atAntDashDesignProDashLayout.libTypingsMod.WithFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var copyright: js.UndefOr[String] = js.undefined
  var links: js.UndefOr[WithFalse[js.Array[Anon_BlankTarget]]] = js.undefined
}

object FooterProps {
  @scala.inline
  def apply(copyright: String = null, links: WithFalse[js.Array[Anon_BlankTarget]] = null): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterProps]
  }
}

