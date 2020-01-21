package typings.asyncSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapacity extends js.Object {
  var capacity: js.UndefOr[Double] = js.undefined
  var initFn: js.UndefOr[js.Function0[_]] = js.undefined
  var pauseFn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resumeFn: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonCapacity {
  @scala.inline
  def apply(
    capacity: Int | Double = null,
    initFn: () => _ = null,
    pauseFn: () => Unit = null,
    resumeFn: () => Unit = null
  ): AnonCapacity = {
    val __obj = js.Dynamic.literal()
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (initFn != null) __obj.updateDynamic("initFn")(js.Any.fromFunction0(initFn))
    if (pauseFn != null) __obj.updateDynamic("pauseFn")(js.Any.fromFunction0(pauseFn))
    if (resumeFn != null) __obj.updateDynamic("resumeFn")(js.Any.fromFunction0(resumeFn))
    __obj.asInstanceOf[AnonCapacity]
  }
}

