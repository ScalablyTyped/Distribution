package typings
package atAntDashDesignProDashLayoutLib.libFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterProps extends js.Object {
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[js.Array[atAntDashDesignProDashLayoutLib.Anon_BlankTarget]] = js.undefined
}

object FooterProps {
  @scala.inline
  def apply(
    copyright: java.lang.String = null,
    links: js.Array[atAntDashDesignProDashLayoutLib.Anon_BlankTarget] = null
  ): FooterProps = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[FooterProps]
  }
}

