package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polyline extends EventBindable {
  def getBounds(): Bounds
  def getExtData(): js.Any
  def getLength(): Double
  def getOptions(): PolylineOptions
  def getPath(): js.Array[LngLat]
  def hide(): Unit
  def setExtData(ext: js.Any): Unit
  def setMap(map: Map): Unit
  def setOptions(opt: PolylineOptions): Unit
  def setPath(path: js.Array[LngLat]): Unit
  def show(): Unit
}

object Polyline {
  @scala.inline
  def apply(
    getBounds: () => Bounds,
    getExtData: () => js.Any,
    getLength: () => Double,
    getOptions: () => PolylineOptions,
    getPath: () => js.Array[LngLat],
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: PolylineOptions => Unit,
    setPath: js.Array[LngLat] => Unit,
    show: () => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getExtData = js.Any.fromFunction0(getExtData), getLength = js.Any.fromFunction0(getLength), getOptions = js.Any.fromFunction0(getOptions), getPath = js.Any.fromFunction0(getPath), hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setPath = js.Any.fromFunction1(setPath), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Polyline]
  }
}

