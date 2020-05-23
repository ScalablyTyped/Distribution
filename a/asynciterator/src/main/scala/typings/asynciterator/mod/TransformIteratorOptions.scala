package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformIteratorOptions[S] extends BufferedIteratorOptions {
  var optional: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[AsyncIterator[S]] = js.undefined
}

object TransformIteratorOptions {
  @scala.inline
  def apply[S](
    autoStart: js.UndefOr[Boolean] = js.undefined,
    maxBufferSize: js.UndefOr[Double] = js.undefined,
    optional: js.UndefOr[Boolean] = js.undefined,
    source: AsyncIterator[S] = null
  ): TransformIteratorOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBufferSize)) __obj.updateDynamic("maxBufferSize")(maxBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformIteratorOptions[S]]
  }
}

