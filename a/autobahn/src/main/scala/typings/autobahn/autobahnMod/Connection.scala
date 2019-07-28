package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autobahn", "Connection")
@js.native
class Connection () extends js.Object {
  def this(options: IConnectionOptions) = this()
  val defer: js.UndefOr[DeferFactory] = js.native
  val isConnected: Boolean = js.native
  val isOpen: Boolean = js.native
  val isRetrying: Boolean = js.native
  val session: js.UndefOr[Session] = js.native
  val transport: ITransport = js.native
  def close(): Unit = js.native
  def close(reason: String): Unit = js.native
  def close(reason: String, message: String): Unit = js.native
  def onclose(reason: String, details: js.Any): Boolean = js.native
  def onopen(session: Session, details: js.Any): Unit = js.native
  def open(): Unit = js.native
}

