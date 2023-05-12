package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelMessage
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelMessage
  extends StObject
     with JobOutboundMessageChannelBase
     with JobOutboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobOutboundMessageChannelMessage: ChannelMessage
  
  /**
    * The message being sent to the channel.
    */
  val message: JsonValue
}
object JobOutboundMessageChannelMessage {
  
  inline def apply(description: JobDescription, kind: ChannelMessage, name: String): JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[JobOutboundMessageChannelMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOutboundMessageChannelMessage] (val x: Self) extends AnyVal {
    
    inline def setKind(value: ChannelMessage): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: JsonValue): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
  }
}
