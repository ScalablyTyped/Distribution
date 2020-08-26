package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation extends EventBindable {
  def clearWatch(watchId: Double): Double = js.native
  def getCurrentPosition(): Unit = js.native
  def isSupported(): Boolean = js.native
  def watchPosition(): Double = js.native
}

object Geolocation {
  @scala.inline
  def apply(
    clearWatch: Double => Double,
    getCurrentPosition: () => Unit,
    isSupported: () => Boolean,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    watchPosition: () => Double
  ): Geolocation = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentPosition = js.Any.fromFunction0(getCurrentPosition), isSupported = js.Any.fromFunction0(isSupported), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), watchPosition = js.Any.fromFunction0(watchPosition))
    __obj.asInstanceOf[Geolocation]
  }
  @scala.inline
  implicit class GeolocationOps[Self <: Geolocation] (val x: Self) extends AnyVal {
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
    def setClearWatch(value: Double => Double): Self = this.set("clearWatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCurrentPosition(value: () => Unit): Self = this.set("getCurrentPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = this.set("isSupported", js.Any.fromFunction0(value))
    @scala.inline
    def setWatchPosition(value: () => Double): Self = this.set("watchPosition", js.Any.fromFunction0(value))
  }
  
}

