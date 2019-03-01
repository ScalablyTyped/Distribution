package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedIteratorOptions extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var maxBufferSize: js.UndefOr[scala.Double] = js.undefined
}

object BufferedIteratorOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    maxBufferSize: scala.Int | scala.Double = null
  ): BufferedIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferedIteratorOptions]
  }
}

