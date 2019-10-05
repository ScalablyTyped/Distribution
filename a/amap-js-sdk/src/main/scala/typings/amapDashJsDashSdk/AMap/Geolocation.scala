package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_ButtonDom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geolocation")
@js.native
class Geolocation protected () extends EventBindable {
  def this(options: Anon_ButtonDom) = this()
  def clearWatch(watchId: Double): Double = js.native
  def getCurrentPosition(): Unit = js.native
  def isSupported(): Boolean = js.native
  def watchPosition(): Double = js.native
}

