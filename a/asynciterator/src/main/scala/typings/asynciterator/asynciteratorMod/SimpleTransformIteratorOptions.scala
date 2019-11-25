package typings.asynciterator.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTransformIteratorOptions[S, T] extends TransformIteratorOptions[S] {
  var append: js.UndefOr[js.Array[T]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[js.Function1[/* item */ S, T]] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var prepend: js.UndefOr[js.Array[T]] = js.undefined
  var transform: js.UndefOr[
    js.Function2[/* item */ S, /* callback */ js.Function1[/* result */ T, Unit], Unit]
  ] = js.undefined
}

object SimpleTransformIteratorOptions {
  @scala.inline
  def apply[S, T](
    append: js.Array[T] = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    filter: /* item */ S => Boolean = null,
    limit: Int | Double = null,
    map: /* item */ S => T = null,
    maxBufferSize: Int | Double = null,
    offset: Int | Double = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    prepend: js.Array[T] = null,
    source: AsyncIterator[S] = null,
    transform: (/* item */ S, /* callback */ js.Function1[/* result */ T, Unit]) => Unit = null
  ): SimpleTransformIteratorOptions[S, T] = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (maxBufferSize != null) __obj.updateDynamic("maxBufferSize")(maxBufferSize.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(prepend.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[SimpleTransformIteratorOptions[S, T]]
  }
}

