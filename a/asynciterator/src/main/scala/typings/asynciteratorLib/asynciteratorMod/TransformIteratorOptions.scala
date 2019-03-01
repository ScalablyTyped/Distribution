package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformIteratorOptions[S] extends BufferedIteratorOptions {
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[AsyncIterator[S]] = js.undefined
}

object TransformIteratorOptions {
  @scala.inline
  def apply[S](
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    maxBufferSize: scala.Int | scala.Double = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    source: AsyncIterator[S] = null
  ): TransformIteratorOptions[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[TransformIteratorOptions[S]]
  }
}

