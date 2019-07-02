package typings
package audiobufferDashToDashWavLib.audiobufferDashToDashWavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var float32: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(float32: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(float32)) __obj.updateDynamic("float32")(float32)
    __obj.asInstanceOf[Options]
  }
}

