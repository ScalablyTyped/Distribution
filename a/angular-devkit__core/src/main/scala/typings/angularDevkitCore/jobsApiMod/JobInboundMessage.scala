package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.jobsApiMod.JobInboundMessageKind.Input
import typings.angularDevkitCore.jobsApiMod.JobInboundMessageKind.Ping
import typings.angularDevkitCore.jobsApiMod.JobInboundMessageKind.Stop
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitCore.jobsApiMod.JobInboundMessagePing
  - typings.angularDevkitCore.jobsApiMod.JobInboundMessageStop
  - typings.angularDevkitCore.jobsApiMod.JobInboundMessageInput[InputT]
*/
trait JobInboundMessage[InputT /* <: JsonValue */] extends StObject
object JobInboundMessage {
  
  inline def JobInboundMessageInput[InputT /* <: JsonValue */](kind: Input, value: InputT): typings.angularDevkitCore.jobsApiMod.JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobInboundMessageInput[InputT]]
  }
  
  inline def JobInboundMessagePing(id: Double, kind: Ping): typings.angularDevkitCore.jobsApiMod.JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobInboundMessagePing]
  }
  
  inline def JobInboundMessageStop(kind: Stop): typings.angularDevkitCore.jobsApiMod.JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.jobsApiMod.JobInboundMessageStop]
  }
}
