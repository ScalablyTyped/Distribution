package typings
package agDashGridLib.distLibInterfacesIEventEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  def addEventListener(eventType: java.lang.String, listener: js.Function): scala.Unit = js.native
  def addEventListener(eventType: java.lang.String, listener: js.Function, async: scala.Boolean): scala.Unit = js.native
  def removeEventListener(eventType: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(eventType: java.lang.String, listener: js.Function, async: scala.Boolean): scala.Unit = js.native
}

