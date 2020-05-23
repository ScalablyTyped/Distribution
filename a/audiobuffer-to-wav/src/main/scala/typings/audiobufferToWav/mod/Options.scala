package typings.audiobufferToWav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var float32: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(float32: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(float32)) __obj.updateDynamic("float32")(float32.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

