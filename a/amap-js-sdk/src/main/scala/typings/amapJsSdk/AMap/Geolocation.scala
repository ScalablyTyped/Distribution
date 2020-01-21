package typings.amapJsSdk.AMap

import typings.amapJsSdk.AnonButtonDom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geolocation")
@js.native
class Geolocation protected () extends EventBindable {
  def this(options: AnonButtonDom) = this()
  def clearWatch(watchId: Double): Double = js.native
  def getCurrentPosition(): Unit = js.native
  def isSupported(): Boolean = js.native
  def watchPosition(): Double = js.native
}

