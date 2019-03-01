package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passthrough extends js.Object {
  /**
    * Passthrough the read values, by default it eats everything
    */
  var passthrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whethe to wait for asynchronous functions (await)
    */
  @JSName("wait")
  var wait_FAnon_Passthrough: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Passthrough {
  @scala.inline
  def apply(
    passthrough: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Passthrough = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_Passthrough]
  }
}

