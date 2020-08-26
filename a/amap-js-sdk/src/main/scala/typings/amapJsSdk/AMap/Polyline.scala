package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline extends EventBindable {
  def getBounds(): Bounds = js.native
  def getExtData(): js.Any = js.native
  def getLength(): Double = js.native
  def getOptions(): PolylineOptions = js.native
  def getPath(): js.Array[LngLat] = js.native
  def hide(): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(opt: PolylineOptions): Unit = js.native
  def setPath(path: js.Array[LngLat]): Unit = js.native
  def show(): Unit = js.native
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
  @scala.inline
  implicit class PolylineOps[Self <: Polyline] (val x: Self) extends AnyVal {
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
    def setGetBounds(value: () => Bounds): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExtData(value: () => js.Any): Self = this.set("getExtData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptions(value: () => PolylineOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPath(value: () => js.Array[LngLat]): Self = this.set("getPath", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setSetExtData(value: js.Any => Unit): Self = this.set("setExtData", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMap(value: Map => Unit): Self = this.set("setMap", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptions(value: PolylineOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPath(value: js.Array[LngLat] => Unit): Self = this.set("setPath", js.Any.fromFunction1(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

