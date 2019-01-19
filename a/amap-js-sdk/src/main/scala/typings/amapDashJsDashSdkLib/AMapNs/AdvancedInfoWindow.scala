package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.AdvancedInfoWindow")
@js.native
class AdvancedInfoWindow () extends EventBindable {
  def this(options: amapDashJsDashSdkLib.Anon_AsDestination) = this()
  def close(): scala.Unit = js.native
  def getContent(): java.lang.String = js.native
  def getIsOpen(): scala.Boolean = js.native
  def getPosition(): LngLat = js.native
  def open(map: Map, pos: LngLat): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  def setPosition(lnglat: LngLat): scala.Unit = js.native
}

