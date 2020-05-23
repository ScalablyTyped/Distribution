package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.EventBindable")
@js.native
abstract class EventBindable ()
  extends typings.amapJsSdk.AMap.EventBindable {
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

