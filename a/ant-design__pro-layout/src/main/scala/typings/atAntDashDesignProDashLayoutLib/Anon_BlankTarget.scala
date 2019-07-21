package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlankTarget extends js.Object {
  var blankTarget: js.UndefOr[scala.Boolean] = js.undefined
  var href: java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  var title: reactLib.reactMod.ReactNode
}

object Anon_BlankTarget {
  @scala.inline
  def apply(
    href: java.lang.String,
    title: reactLib.reactMod.ReactNode,
    blankTarget: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null
  ): Anon_BlankTarget = {
    val __obj = js.Dynamic.literal(href = href, title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(blankTarget)) __obj.updateDynamic("blankTarget")(blankTarget)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_BlankTarget]
  }
}

