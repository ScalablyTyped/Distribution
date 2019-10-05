package typings.atAntDashDesignProDashLayout

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlankTarget extends js.Object {
  var blankTarget: js.UndefOr[Boolean] = js.undefined
  var href: String
  var key: js.UndefOr[String] = js.undefined
  var title: ReactNode
}

object Anon_BlankTarget {
  @scala.inline
  def apply(
    href: String,
    blankTarget: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    title: ReactNode = null
  ): Anon_BlankTarget = {
    val __obj = js.Dynamic.literal(href = href)
    if (!js.isUndefined(blankTarget)) __obj.updateDynamic("blankTarget")(blankTarget)
    if (key != null) __obj.updateDynamic("key")(key)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BlankTarget]
  }
}

