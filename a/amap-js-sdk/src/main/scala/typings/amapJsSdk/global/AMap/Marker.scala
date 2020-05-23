package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.MarkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 点标记。
  */
@JSGlobal("AMap.Marker")
@js.native
class Marker ()
  extends typings.amapJsSdk.AMap.Marker {
  def this(options: MarkerOptions) = this()
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

