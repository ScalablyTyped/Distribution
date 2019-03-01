package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collapsed extends js.Object {
  var collapsed: js.UndefOr[scala.Boolean]
}

object Anon_Collapsed {
  @scala.inline
  def apply(collapsed: js.UndefOr[scala.Boolean] = js.undefined): Anon_Collapsed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    __obj.asInstanceOf[Anon_Collapsed]
  }
}

