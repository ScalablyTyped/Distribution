package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geolocation extends EventBindable {
  def clearWatch(watchId: Double): Double
  def getCurrentPosition(): Unit
  def isSupported(): Boolean
  def watchPosition(): Double
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
}

