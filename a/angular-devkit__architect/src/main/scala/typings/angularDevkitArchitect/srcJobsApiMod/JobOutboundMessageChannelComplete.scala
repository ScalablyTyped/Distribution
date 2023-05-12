package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelComplete
  extends StObject
     with JobOutboundMessageChannelBase
     with JobOutboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobOutboundMessageChannelComplete: ChannelComplete
}
object JobOutboundMessageChannelComplete {
  
  inline def apply(description: JobDescription, kind: ChannelComplete, name: String): JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageChannelComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOutboundMessageChannelComplete] (val x: Self) extends AnyVal {
    
    inline def setKind(value: ChannelComplete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
