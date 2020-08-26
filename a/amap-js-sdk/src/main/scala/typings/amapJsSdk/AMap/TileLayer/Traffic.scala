package typings.amapJsSdk.AMap.TileLayer

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.Layer
import typings.amapJsSdk.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traffic extends Layer {
  var autoRefresh: Boolean = js.native
  var interval: Double = js.native
}

object Traffic {
  @scala.inline
  def apply(
    autoRefresh: Boolean,
    getTiles: () => js.Array[String],
    getZooms: () => js.Array[Double],
    hide: () => Unit,
    interval: Double,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    reload: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setTileUrl: () => Unit,
    setzIndex: Double => Unit,
    show: () => Unit
  ): Traffic = {
    val __obj = js.Dynamic.literal(autoRefresh = autoRefresh.asInstanceOf[js.Any], getTiles = js.Any.fromFunction0(getTiles), getZooms = js.Any.fromFunction0(getZooms), hide = js.Any.fromFunction0(hide), interval = interval.asInstanceOf[js.Any], off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), reload = js.Any.fromFunction0(reload), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setTileUrl = js.Any.fromFunction0(setTileUrl), setzIndex = js.Any.fromFunction1(setzIndex), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Traffic]
  }
  @scala.inline
  implicit class TrafficOps[Self <: Traffic] (val x: Self) extends AnyVal {
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
    def setAutoRefresh(value: Boolean): Self = this.set("autoRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
  }
  
}

