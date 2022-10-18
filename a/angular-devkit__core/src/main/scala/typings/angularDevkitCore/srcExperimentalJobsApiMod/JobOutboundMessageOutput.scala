package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Output
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageOutput[OutputT /* <: JsonValue */]
  extends StObject
     with JobOutboundMessageBase
     with JobOutboundMessage[OutputT] {
  
  @JSName("kind")
  val kind_JobOutboundMessageOutput: Output
  
  /**
    * The message being outputted from the job.
    */
  val value: OutputT
}
object JobOutboundMessageOutput {
  
  inline def apply[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageOutput[OutputT]]
  }
  
  extension [Self <: JobOutboundMessageOutput[?], OutputT /* <: JsonValue */](x: Self & JobOutboundMessageOutput[OutputT]) {
    
    inline def setKind(value: Output): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: OutputT): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
