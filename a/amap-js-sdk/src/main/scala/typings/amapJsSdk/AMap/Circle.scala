package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  def contains(point: LngLat): Boolean
  def getBounds(): Bounds
  def getCenter(): LngLat
  def getExtData(): js.Any
  def getOptions(): CircleOptions
  def getRadius(): Double
  def hide(): Unit
  def setCenter(lnglat: LngLat): Unit
  def setExtData(ext: js.Any): Unit
  def setMap(map: Map): Unit
  def setOptions(circleopt: CircleOptions): Unit
  def setRadius(radius: Double): Unit
  def show(): Unit
}

object Circle {
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getBounds: () => Bounds,
    getCenter: () => LngLat,
    getExtData: () => js.Any,
    getOptions: () => CircleOptions,
    getRadius: () => Double,
    hide: () => Unit,
    setCenter: LngLat => Unit,
    setExtData: js.Any => Unit,
    setMap: Map => Unit,
    setOptions: CircleOptions => Unit,
    setRadius: Double => Unit,
    show: () => Unit
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = js.Any.fromFunction0(getBounds), getCenter = js.Any.fromFunction0(getCenter), getExtData = js.Any.fromFunction0(getExtData), getOptions = js.Any.fromFunction0(getOptions), getRadius = js.Any.fromFunction0(getRadius), hide = js.Any.fromFunction0(hide), setCenter = js.Any.fromFunction1(setCenter), setExtData = js.Any.fromFunction1(setExtData), setMap = js.Any.fromFunction1(setMap), setOptions = js.Any.fromFunction1(setOptions), setRadius = js.Any.fromFunction1(setRadius), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Circle]
  }
}

