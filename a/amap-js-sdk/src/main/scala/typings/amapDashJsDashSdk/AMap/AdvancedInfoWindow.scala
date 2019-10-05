package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_AsDestination
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.AdvancedInfoWindow")
@js.native
class AdvancedInfoWindow () extends EventBindable {
  def this(options: Anon_AsDestination) = this()
  def close(): Unit = js.native
  def getContent(): String = js.native
  def getIsOpen(): Boolean = js.native
  def getPosition(): LngLat = js.native
  def open(map: Map, pos: LngLat): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  def setPosition(lnglat: LngLat): Unit = js.native
}

