package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Transpile extends js.Object {
  var transpile: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Transpile {
  @scala.inline
  def apply(transpile: js.UndefOr[scala.Boolean] = js.undefined): Anon_Transpile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[Anon_Transpile]
  }
}

