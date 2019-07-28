package typings.agDashGrid.distLibInterfacesIEventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  def addEventListener(eventType: String, listener: js.Function): Unit = js.native
  def addEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
  def removeEventListener(eventType: String, listener: js.Function): Unit = js.native
  def removeEventListener(eventType: String, listener: js.Function, async: Boolean): Unit = js.native
}

