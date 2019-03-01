package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backwards extends js.Object {
  var backwards: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Backwards {
  @scala.inline
  def apply(backwards: js.UndefOr[scala.Boolean] = js.undefined): Anon_Backwards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards)
    __obj.asInstanceOf[Anon_Backwards]
  }
}

