package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.ChannelComplete
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.ChannelCreate
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.ChannelMessage
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.End
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.OnReady
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.Output
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.Pong
import typings.angularDevkitCore.jobsApiMod.JobOutboundMessageKind.Start
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOnReady
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageStart
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOutput[OutputT]
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelCreate
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelMessage
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelError
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelComplete
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessageEnd
  - typings.angularDevkitCore.jobsApiMod.JobOutboundMessagePong
*/
trait JobOutboundMessage[OutputT /* <: JsonValue */] extends StObject
object JobOutboundMessage {
  
  inline def JobOutboundMessageChannelComplete(description: JobDescription, kind: ChannelComplete, name: String): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelComplete]
  }
  
  inline def JobOutboundMessageChannelCreate(description: JobDescription, kind: ChannelCreate, name: String): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelCreate]
  }
  
  inline def JobOutboundMessageChannelError(description: JobDescription, kind: ChannelError, name: String): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelError]
  }
  
  inline def JobOutboundMessageChannelMessage(description: JobDescription, kind: ChannelMessage, name: String): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageChannelMessage]
  }
  
  inline def JobOutboundMessageEnd(description: JobDescription, kind: End): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageEnd]
  }
  
  inline def JobOutboundMessageOnReady(description: JobDescription, kind: OnReady): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOnReady]
  }
  
  inline def JobOutboundMessageOutput[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageOutput[OutputT]]
  }
  
  inline def JobOutboundMessagePong(description: JobDescription, id: Double, kind: Pong): typings.angularDevkitCore.jobsApiMod.JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessagePong]
  }
  
  inline def JobOutboundMessageStart(description: JobDescription, kind: Start): typings.angularDevkitCore.jobsApiMod.JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobOutboundMessageStart]
  }
}
