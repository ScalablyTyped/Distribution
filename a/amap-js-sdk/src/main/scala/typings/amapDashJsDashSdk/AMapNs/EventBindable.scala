package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.EventBindable")
@js.native
abstract class EventBindable () extends js.Object {
  def off(eventName: String, callback: EventCallback): Unit = js.native
  def on(eventName: String, callback: EventCallback): Unit = js.native
}

