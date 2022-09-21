package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autobahn", "Connection")
@js.native
open class Connection () extends StObject {
  def this(options: IConnectionOptions) = this()
  
  def close(): Unit = js.native
  def close(reason: String): Unit = js.native
  def close(reason: String, message: String): Unit = js.native
  def close(reason: Unit, message: String): Unit = js.native
  
  val defer: js.UndefOr[DeferFactory] = js.native
  
  val isConnected: Boolean = js.native
  
  val isOpen: Boolean = js.native
  
  val isRetrying: Boolean = js.native
  
  def onclose(reason: String, details: Any): Boolean = js.native
  
  def onopen(session: Session, details: Any): Unit = js.native
  
  def open(): Unit = js.native
  
  val session: js.UndefOr[Session] = js.native
  
  val transport: ITransport = js.native
}
