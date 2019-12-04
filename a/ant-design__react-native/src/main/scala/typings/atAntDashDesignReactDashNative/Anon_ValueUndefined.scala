package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueUndefined extends js.Object {
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ValueUndefined {
  @scala.inline
  def apply(value: js.UndefOr[scala.Nothing] = js.undefined): Anon_ValueUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ValueUndefined]
  }
}

