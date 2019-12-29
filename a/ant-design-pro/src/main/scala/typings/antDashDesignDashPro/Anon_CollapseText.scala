package typings.antDashDesignDashPro

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollapseText extends js.Object {
  var collapseText: js.UndefOr[ReactNode] = js.undefined
  var expandText: js.UndefOr[ReactNode] = js.undefined
  var selectAllText: js.UndefOr[ReactNode] = js.undefined
}

object Anon_CollapseText {
  @scala.inline
  def apply(collapseText: ReactNode = null, expandText: ReactNode = null, selectAllText: ReactNode = null): Anon_CollapseText = {
    val __obj = js.Dynamic.literal()
    if (collapseText != null) __obj.updateDynamic("collapseText")(collapseText.asInstanceOf[js.Any])
    if (expandText != null) __obj.updateDynamic("expandText")(expandText.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollapseText]
  }
}

