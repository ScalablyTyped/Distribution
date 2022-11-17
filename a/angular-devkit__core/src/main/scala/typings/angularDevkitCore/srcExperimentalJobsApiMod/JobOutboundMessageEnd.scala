package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageEnd
  extends StObject
     with JobOutboundMessageBase {
  
  @JSName("kind")
  val kind_JobOutboundMessageEnd: End
}
object JobOutboundMessageEnd {
  
  inline def apply(description: JobDescription, kind: End): JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageEnd]
  }
  
  extension [Self <: JobOutboundMessageEnd](x: Self) {
    
    inline def setKind(value: End): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
