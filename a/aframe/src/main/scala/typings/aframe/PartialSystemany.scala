package typings.aframe

import typings.aframe.mod.Schema_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.System<any>> */
trait PartialSystemany extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  var schema: js.UndefOr[Schema_[_]] = js.undefined
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
}

object PartialSystemany {
  @scala.inline
  def apply(
    data: js.Any = null,
    init: () => Unit = null,
    pause: () => Unit = null,
    play: () => Unit = null,
    schema: Schema_[_] = null,
    tick: (/* t */ Double, /* dt */ Double) => Unit = null
  ): PartialSystemany = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction0(play))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2(tick))
    __obj.asInstanceOf[PartialSystemany]
  }
}

