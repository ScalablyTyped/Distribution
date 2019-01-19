package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.EventBindable")
@js.native
abstract class EventBindable () extends js.Object {
  def off(eventName: java.lang.String, callback: EventCallback): scala.Unit = js.native
  def on(eventName: java.lang.String, callback: EventCallback): scala.Unit = js.native
}

