package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Input
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Ping
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Stop
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop
  - typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT]
*/
trait JobInboundMessage[InputT /* <: JsonValue */] extends StObject
object JobInboundMessage {
  
  inline def JobInboundMessageInput[InputT /* <: JsonValue */](kind: Input, value: InputT): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT]]
  }
  
  inline def JobInboundMessagePing(id: Double, kind: Ping): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing]
  }
  
  inline def JobInboundMessageStop(kind: Stop): typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop]
  }
}
