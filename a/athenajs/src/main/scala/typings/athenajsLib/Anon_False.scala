package typings
package athenajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var loop: js.UndefOr[athenajsLib.athenajsLibNumbers.`false`] = js.undefined
  var pan: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(loop: athenajsLib.athenajsLibNumbers.`false` = null, pan: js.UndefOr[scala.Boolean] = js.undefined): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (loop != null) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan)
    __obj.asInstanceOf[Anon_False]
  }
}

