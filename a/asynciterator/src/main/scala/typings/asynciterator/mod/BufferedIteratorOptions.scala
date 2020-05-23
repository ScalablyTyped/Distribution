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
  def apply(autoStart: js.UndefOr[Boolean] = js.undefined, maxBufferSize: js.UndefOr[Double] = js.undefined): BufferedIteratorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferSize)) __obj.updateDynamic("maxBufferSize")(maxBufferSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferedIteratorOptions]
  }
}

