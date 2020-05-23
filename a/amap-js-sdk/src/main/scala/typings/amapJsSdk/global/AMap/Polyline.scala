package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polyline")
@js.native
class Polyline ()
  extends typings.amapJsSdk.AMap.Polyline {
  def this(options: PolylineOptions) = this()
  /* CompleteClass */
  override def getBounds(): typings.amapJsSdk.AMap.Bounds = js.native
  /* CompleteClass */
  override def getExtData(): js.Any = js.native
  /* CompleteClass */
  override def getLength(): Double = js.native
  /* CompleteClass */
  override def getOptions(): PolylineOptions = js.native
  /* CompleteClass */
  override def getPath(): js.Array[typings.amapJsSdk.AMap.LngLat] = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def setExtData(ext: js.Any): Unit = js.native
  /* CompleteClass */
  override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
  /* CompleteClass */
  override def setOptions(opt: PolylineOptions): Unit = js.native
  /* CompleteClass */
  override def setPath(path: js.Array[typings.amapJsSdk.AMap.LngLat]): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
}

