package typings.amapJsSdk.AMap

import typings.amapJsSdk.AnonIsOpen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.OverView")
@js.native
class OverView ()
  extends EventBindable
     with MapControl {
  def this(options: AnonIsOpen) = this()
  def close(): Unit = js.native
  def getTileLayer(): TileLayer = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  def open(): Unit = js.native
  def setTileLayer(layer: TileLayer): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

