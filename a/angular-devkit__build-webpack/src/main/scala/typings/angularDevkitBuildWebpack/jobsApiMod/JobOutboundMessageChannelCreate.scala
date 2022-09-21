package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelCreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelCreate
  extends StObject
     with JobOutboundMessageChannelBase
     with JobOutboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobOutboundMessageChannelCreate: ChannelCreate
}
object JobOutboundMessageChannelCreate {
  
  inline def apply(description: JobDescription, kind: ChannelCreate, name: String): JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageChannelCreate]
  }
  
  extension [Self <: JobOutboundMessageChannelCreate](x: Self) {
    
    inline def setKind(value: ChannelCreate): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
