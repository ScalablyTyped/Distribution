package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transpile extends js.Object {
  var transpile: js.UndefOr[Boolean] = js.undefined
}

object Anon_Transpile {
  @scala.inline
  def apply(transpile: js.UndefOr[Boolean] = js.undefined): Anon_Transpile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[Anon_Transpile]
  }
}

