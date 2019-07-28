package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System[T /* <: js.Object */] extends js.Object {
  var data: T
  var schema: Schema[T]
  var tick: js.UndefOr[js.Function2[/* t */ Double, /* dt */ Double, Unit]] = js.undefined
  def init(): Unit
  def pause(): Unit
  def play(): Unit
}

object System {
  @scala.inline
  def apply[T /* <: js.Object */](
    data: T,
    init: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    schema: Schema[T],
    tick: (/* t */ Double, /* dt */ Double) => Unit = null
  ): System[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), schema = schema.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2(tick))
    __obj.asInstanceOf[System[T]]
  }
}

