package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Input
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInboundMessageInput[InputT /* <: JsonValue */]
  extends StObject
     with JobInboundMessageBase
     with JobInboundMessage[InputT] {
  
  @JSName("kind")
  val kind_JobInboundMessageInput: Input
  
  /**
    * The input being sent to the job.
    */
  val value: InputT
}
object JobInboundMessageInput {
  
  inline def apply[InputT /* <: JsonValue */](kind: Input, value: InputT): JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInboundMessageInput[InputT]]
  }
  
  extension [Self <: JobInboundMessageInput[?], InputT /* <: JsonValue */](x: Self & JobInboundMessageInput[InputT]) {
    
    inline def setKind(value: Input): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: InputT): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
