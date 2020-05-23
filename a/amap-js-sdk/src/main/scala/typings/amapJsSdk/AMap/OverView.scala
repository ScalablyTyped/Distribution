package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverView
  extends EventBindable
     with MapControl {
  def close(): Unit
  def getTileLayer(): TileLayer
  def open(): Unit
  def setTileLayer(layer: TileLayer): Unit
}

object OverView {
  @scala.inline
  def apply(
    close: () => Unit,
    getTileLayer: () => TileLayer,
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    open: () => Unit,
    setTileLayer: TileLayer => Unit,
    show: () => Unit
  ): OverView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getTileLayer = js.Any.fromFunction0(getTileLayer), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), setTileLayer = js.Any.fromFunction1(setTileLayer), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[OverView]
  }
}

