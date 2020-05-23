package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.anon.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Driving")
@js.native
class Driving ()
  extends typings.amapJsSdk.AMap.Driving {
  def this(options: Extensions) = this()
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

