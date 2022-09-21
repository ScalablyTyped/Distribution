package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelComplete
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelCreate
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelMessage
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.End
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.OnReady
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Output
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Pong
import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Start
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOnReady
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageStart
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOutput[OutputT]
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelCreate
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelMessage
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelError
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelComplete
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageEnd
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessagePong
*/
trait JobOutboundMessage[OutputT /* <: JsonValue */] extends StObject
object JobOutboundMessage {
  
  inline def JobOutboundMessageChannelComplete(description: JobDescription, kind: ChannelComplete, name: String): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelComplete]
  }
  
  inline def JobOutboundMessageChannelCreate(description: JobDescription, kind: ChannelCreate, name: String): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelCreate]
  }
  
  inline def JobOutboundMessageChannelError(description: JobDescription, kind: ChannelError, name: String): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelError]
  }
  
  inline def JobOutboundMessageChannelMessage(description: JobDescription, kind: ChannelMessage, name: String): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageChannelMessage]
  }
  
  inline def JobOutboundMessageEnd(description: JobDescription, kind: End): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageEnd]
  }
  
  inline def JobOutboundMessageOnReady(description: JobDescription, kind: OnReady): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOnReady]
  }
  
  inline def JobOutboundMessageOutput[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageOutput[OutputT]]
  }
  
  inline def JobOutboundMessagePong(description: JobDescription, id: Double, kind: Pong): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessagePong]
  }
  
  inline def JobOutboundMessageStart(description: JobDescription, kind: Start): typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageStart]
  }
}
