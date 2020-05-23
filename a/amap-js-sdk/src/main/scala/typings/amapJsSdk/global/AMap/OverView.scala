package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.anon.IsOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.OverView")
@js.native
class OverView ()
  extends typings.amapJsSdk.AMap.OverView {
  def this(options: IsOpen) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def getTileLayer(): typings.amapJsSdk.AMap.TileLayer = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
  /* CompleteClass */
  override def setTileLayer(layer: typings.amapJsSdk.AMap.TileLayer): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

