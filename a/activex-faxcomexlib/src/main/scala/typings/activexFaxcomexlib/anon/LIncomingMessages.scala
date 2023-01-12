package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LIncomingMessages extends StObject {
  
  val lIncomingMessages: Double
  
  val lOutgoingMessages: Double
  
  val lQueuedMessages: Double
  
  val lRoutingMessages: Double
  
  val pFaxServer: FaxServer
}
object LIncomingMessages {
  
  inline def apply(
    lIncomingMessages: Double,
    lOutgoingMessages: Double,
    lQueuedMessages: Double,
    lRoutingMessages: Double,
    pFaxServer: FaxServer
  ): LIncomingMessages = {
    val __obj = js.Dynamic.literal(lIncomingMessages = lIncomingMessages.asInstanceOf[js.Any], lOutgoingMessages = lOutgoingMessages.asInstanceOf[js.Any], lQueuedMessages = lQueuedMessages.asInstanceOf[js.Any], lRoutingMessages = lRoutingMessages.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LIncomingMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LIncomingMessages] (val x: Self) extends AnyVal {
    
    inline def setLIncomingMessages(value: Double): Self = StObject.set(x, "lIncomingMessages", value.asInstanceOf[js.Any])
    
    inline def setLOutgoingMessages(value: Double): Self = StObject.set(x, "lOutgoingMessages", value.asInstanceOf[js.Any])
    
    inline def setLQueuedMessages(value: Double): Self = StObject.set(x, "lQueuedMessages", value.asInstanceOf[js.Any])
    
    inline def setLRoutingMessages(value: Double): Self = StObject.set(x, "lRoutingMessages", value.asInstanceOf[js.Any])
    
    inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
