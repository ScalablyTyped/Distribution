package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Layer")
@js.native
abstract class Layer ()
  extends typings.amapJsSdk.AMap.Layer {
  /* CompleteClass */
  override def getTiles(): js.Array[String] = js.native
  /* CompleteClass */
  override def getZooms(): js.Array[Double] = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def reload(): Unit = js.native
  /* CompleteClass */
  override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
  /* CompleteClass */
  override def setOpacity(alpha: Double): Unit = js.native
  /* CompleteClass */
  override def setTileUrl(): Unit = js.native
  /* CompleteClass */
  override def setzIndex(index: Double): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

