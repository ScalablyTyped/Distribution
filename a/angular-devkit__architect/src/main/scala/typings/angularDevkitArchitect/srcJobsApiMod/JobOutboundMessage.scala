package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelComplete
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelCreate
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelMessage
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.End
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.OnReady
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Output
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Pong
import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Start
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOnReady
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageStart
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOutput[OutputT]
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelCreate
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelMessage
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelError
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelComplete
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageEnd
  - typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessagePong
*/
trait JobOutboundMessage[OutputT /* <: JsonValue */] extends StObject
object JobOutboundMessage {
  
  inline def JobOutboundMessageChannelComplete(description: JobDescription, kind: ChannelComplete, name: String): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelComplete]
  }
  
  inline def JobOutboundMessageChannelCreate(description: JobDescription, kind: ChannelCreate, name: String): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelCreate]
  }
  
  inline def JobOutboundMessageChannelError(description: JobDescription, kind: ChannelError, name: String): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelError]
  }
  
  inline def JobOutboundMessageChannelMessage(description: JobDescription, kind: ChannelMessage, name: String): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageChannelMessage]
  }
  
  inline def JobOutboundMessageEnd(description: JobDescription, kind: End): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageEnd]
  }
  
  inline def JobOutboundMessageOnReady(description: JobDescription, kind: OnReady): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOnReady]
  }
  
  inline def JobOutboundMessageOutput[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageOutput[OutputT]]
  }
  
  inline def JobOutboundMessagePong(description: JobDescription, id: Double, kind: Pong): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessagePong]
  }
  
  inline def JobOutboundMessageStart(description: JobDescription, kind: Start): typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageStart]
  }
}
