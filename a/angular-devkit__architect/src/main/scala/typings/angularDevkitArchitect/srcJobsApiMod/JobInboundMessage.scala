package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Input
import typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Ping
import typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Stop
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessagePing
  - typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageStop
  - typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageInput[InputT]
*/
trait JobInboundMessage[InputT /* <: JsonValue */] extends StObject
object JobInboundMessage {
  
  inline def JobInboundMessageInput[InputT /* <: JsonValue */](kind: Input, value: InputT): typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageInput[InputT]]
  }
  
  inline def JobInboundMessagePing(id: Double, kind: Ping): typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessagePing]
  }
  
  inline def JobInboundMessageStop(kind: Stop): typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageStop]
  }
}
