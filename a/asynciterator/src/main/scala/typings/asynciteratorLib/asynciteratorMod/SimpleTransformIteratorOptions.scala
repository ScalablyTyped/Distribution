package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTransformIteratorOptions[S, T] extends TransformIteratorOptions[S] {
  var append: js.UndefOr[js.Array[T]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* item */ S, scala.Boolean]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[js.Function1[/* item */ S, T]] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var prepend: js.UndefOr[js.Array[T]] = js.undefined
  var transform: js.UndefOr[
    js.Function2[/* item */ S, /* callback */ js.Function1[/* result */ T, scala.Unit], scala.Unit]
  ] = js.undefined
}

object SimpleTransformIteratorOptions {
  @scala.inline
  def apply[S, T](
    append: js.Array[T] = null,
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.Function1[/* item */ S, scala.Boolean] = null,
    limit: scala.Int | scala.Double = null,
    map: js.Function1[/* item */ S, T] = null,
    maxBufferSize: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    prepend: js.Array[T] = null,
    source: AsyncIterator[S] = null,
    transform: js.Function2[/* item */ S, /* callback */ js.Function1[/* result */ T, scala.Unit], scala.Unit] = null
  ): SimpleTransformIteratorOptions[S, T] = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (prepend != null) __obj.updateDynamic("prepend")(prepend)
    if (source != null) __obj.updateDynamic("source")(source)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[SimpleTransformIteratorOptions[S, T]]
  }
}

