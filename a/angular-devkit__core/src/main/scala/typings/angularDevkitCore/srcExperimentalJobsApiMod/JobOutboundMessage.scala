package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelComplete
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelCreate
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelMessage
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.End
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.OnReady
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Output
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Pong
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Start
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT]
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong
*/
trait JobOutboundMessage[OutputT /* <: JsonValue */] extends StObject
object JobOutboundMessage {
  
  inline def JobOutboundMessageChannelComplete(description: JobDescription, kind: ChannelComplete, name: String): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete]
  }
  
  inline def JobOutboundMessageChannelCreate(description: JobDescription, kind: ChannelCreate, name: String): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate]
  }
  
  inline def JobOutboundMessageChannelError(description: JobDescription, kind: ChannelError, name: String): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError]
  }
  
  inline def JobOutboundMessageChannelMessage(description: JobDescription, kind: ChannelMessage, name: String): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage]
  }
  
  inline def JobOutboundMessageEnd(description: JobDescription, kind: End): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd]
  }
  
  inline def JobOutboundMessageOnReady(description: JobDescription, kind: OnReady): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady]
  }
  
  inline def JobOutboundMessageOutput[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT]]
  }
  
  inline def JobOutboundMessagePong(description: JobDescription, id: Double, kind: Pong): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong]
  }
  
  inline def JobOutboundMessageStart(description: JobDescription, kind: Start): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart]
  }
}
