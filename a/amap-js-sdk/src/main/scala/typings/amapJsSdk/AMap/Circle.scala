package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends js.Object {
  def contains(point: LngLat): Boolean = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getExtData(): js.Any = js.native
  def getOptions(): CircleOptions = js.native
  def getRadius(): Double = js.native
  def hide(): Unit = js.native
  def setCenter(lnglat: LngLat): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(circleopt: CircleOptions): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  def show(): Unit = js.native
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
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContains(value: LngLat => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBounds(value: () => Bounds): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = this.set("getCenter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExtData(value: () => js.Any): Self = this.set("getExtData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptions(value: () => CircleOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("getRadius", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCenter(value: LngLat => Unit): Self = this.set("setCenter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExtData(value: js.Any => Unit): Self = this.set("setExtData", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMap(value: Map => Unit): Self = this.set("setMap", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptions(value: CircleOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRadius(value: Double => Unit): Self = this.set("setRadius", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

