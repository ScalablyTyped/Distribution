package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Visible extends js.Object {
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Visible {
  @scala.inline
  def apply(visible: js.UndefOr[scala.Boolean] = js.undefined): Anon_Visible = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[Anon_Visible]
  }
}

