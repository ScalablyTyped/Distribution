package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var isOpen: scala.Boolean = js.native
  var isRetrying: scala.Boolean = js.native
  var session: js.UndefOr[Session] = js.native
  def close(): scala.Unit = js.native
  def close(reason: java.lang.String): scala.Unit = js.native
  def close(reason: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def onclose(reason: java.lang.String, details: js.Any): scala.Boolean = js.native
  def onopen(session: Session, details: js.Any): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

