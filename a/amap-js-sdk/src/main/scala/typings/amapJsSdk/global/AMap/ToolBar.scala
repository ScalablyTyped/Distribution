package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.anon.AutoPosition
import typings.amapJsSdk.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ToolBar")
@js.native
class ToolBar ()
  extends typings.amapJsSdk.AMap.ToolBar {
  def this(options: AutoPosition) = this()
  /* CompleteClass */
  override def doLocation(): Unit = js.native
  /* CompleteClass */
  override def getLocation(): Lat = js.native
  /* CompleteClass */
  override def getOffset(): typings.amapJsSdk.AMap.Pixel = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def hideDirection(): Unit = js.native
  /* CompleteClass */
  override def hideLocation(): Unit = js.native
  /* CompleteClass */
  override def hideRuler(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def setOffset(offset: typings.amapJsSdk.AMap.Pixel): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  /* CompleteClass */
  override def showDirection(): Unit = js.native
  /* CompleteClass */
  override def showLocation(): Unit = js.native
  /* CompleteClass */
  override def showRuler(): Unit = js.native
}

