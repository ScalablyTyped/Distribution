package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedIteratorOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var maxBufferSize: js.UndefOr[Double] = js.undefined
}

object BufferedIteratorOptions {
  @scala.inline
  def apply(autoStart: js.UndefOr[Boolean] = js.undefined, maxBufferSize: Int | Double = null): BufferedIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferedIteratorOptions]
  }
}

