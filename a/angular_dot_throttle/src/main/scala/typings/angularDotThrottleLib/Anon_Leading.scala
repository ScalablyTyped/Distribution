package typings
package angularDotThrottleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leading extends js.Object {
  var leading: js.UndefOr[scala.Boolean] = js.undefined
  var trailing: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Leading {
  @scala.inline
  def apply(
    leading: js.UndefOr[scala.Boolean] = js.undefined,
    trailing: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Leading = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading)
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing)
    __obj.asInstanceOf[Anon_Leading]
  }
}

