package typings.amapJsSdk.AMap

import typings.amapJsSdk.AnonAutoMove
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.InfoWindow")
@js.native
class InfoWindow () extends EventBindable {
  def this(options: AnonAutoMove) = this()
  def close(): Unit = js.native
  def getContent(): String = js.native
  def getIsOpen(): Boolean = js.native
  def getPosition(): LngLat = js.native
  def getSize(): Size = js.native
  def open(map: Map, pos: LngLat): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  def setPosition(lnglat: LngLat): Unit = js.native
  def setSize(size: Size): Unit = js.native
}

