package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends EventBindable {
  def getTiles(): js.Array[String]
  def getZooms(): js.Array[Double]
  def hide(): Unit
  def reload(): Unit
  def setMap(map: Map): Unit
  def setOpacity(alpha: Double): Unit
  def setTileUrl(): Unit
  def setzIndex(index: Double): Unit
  def show(): Unit
}

object Layer {
  @scala.inline
  def apply(
    getTiles: () => js.Array[String],
    getZooms: () => js.Array[Double],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    reload: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setTileUrl: () => Unit,
    setzIndex: Double => Unit,
    show: () => Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(getTiles = js.Any.fromFunction0(getTiles), getZooms = js.Any.fromFunction0(getZooms), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), reload = js.Any.fromFunction0(reload), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setTileUrl = js.Any.fromFunction0(setTileUrl), setzIndex = js.Any.fromFunction1(setzIndex), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Layer]
  }
}

