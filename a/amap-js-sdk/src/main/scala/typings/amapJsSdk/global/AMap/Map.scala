package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.MapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Map")
@js.native
class Map protected ()
  extends typings.amapJsSdk.AMap.Map {
  def this(mapDiv: String) = this()
  def this(mapDiv: String, opts: MapOptions) = this()
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

