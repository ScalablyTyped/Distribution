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
    maxBufferSize: Int | Double = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    source: AsyncIterator[S] = null
  ): TransformIteratorOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformIteratorOptions[S]]
  }
}

