package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelError
  extends StObject
     with JobOutboundMessageChannelBase {
  
  /**
    * The error message being sent to the channel.
    */
  val error: JsonValue
  
  @JSName("kind")
  val kind_JobOutboundMessageChannelError: ChannelError
}
object JobOutboundMessageChannelError {
  
  inline def apply(description: JobDescription, kind: ChannelError, name: String): JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[JobOutboundMessageChannelError]
  }
  
  extension [Self <: JobOutboundMessageChannelError](x: Self) {
    
    inline def setError(value: JsonValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setKind(value: ChannelError): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
