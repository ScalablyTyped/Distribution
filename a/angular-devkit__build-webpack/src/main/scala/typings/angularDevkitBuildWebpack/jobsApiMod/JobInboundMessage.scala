package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Input
import typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Ping
import typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Stop
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessagePing
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageStop
  - typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageInput[InputT]
*/
trait JobInboundMessage[InputT /* <: JsonValue */] extends StObject
object JobInboundMessage {
  
  inline def JobInboundMessageInput[InputT /* <: JsonValue */](kind: Input, value: InputT): typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageInput[InputT]]
  }
  
  inline def JobInboundMessagePing(id: Double, kind: Ping): typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessagePing]
  }
  
  inline def JobInboundMessageStop(kind: Stop): typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageStop]
  }
}
