package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System[T /* <: js.Object */] extends js.Object {
  var data: T
  var schema: Schema[T]
  var tick: js.UndefOr[js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit]] = js.undefined
  def init(): scala.Unit
  def pause(): scala.Unit
  def play(): scala.Unit
}

object System {
  @scala.inline
  def apply[T /* <: js.Object */](
    data: T,
    init: js.Function0[scala.Unit],
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    schema: Schema[T],
    tick: js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit] = null
  ): System[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick)
    __obj.asInstanceOf[System[T]]
  }
}

