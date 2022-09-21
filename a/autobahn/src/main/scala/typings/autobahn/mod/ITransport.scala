package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransport extends StObject {
  
  def close(errorCode: Double): Unit = js.native
  def close(errorCode: Double, reason: String): Unit = js.native
  
  var info: ITransportInfo = js.native
  
  def onclose(details: ICloseEventDetails): Unit = js.native
  
  def onmessage(message: js.Array[Any]): Unit = js.native
  
  def onopen(): Unit = js.native
  
  def send(message: js.Array[Any]): Unit = js.native
}
