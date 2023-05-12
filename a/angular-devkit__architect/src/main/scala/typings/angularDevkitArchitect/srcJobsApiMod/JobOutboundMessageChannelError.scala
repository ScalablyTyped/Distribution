package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelError
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelError
  extends StObject
     with JobOutboundMessageChannelBase
     with JobOutboundMessage[Any] {
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOutboundMessageChannelError] (val x: Self) extends AnyVal {
    
    inline def setError(value: JsonValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setKind(value: ChannelError): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
