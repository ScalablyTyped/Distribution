package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageStart
  extends StObject
     with JobOutboundMessageBase
     with JobOutboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobOutboundMessageStart: Start
}
object JobOutboundMessageStart {
  
  inline def apply(description: JobDescription, kind: Start): JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOutboundMessageStart] (val x: Self) extends AnyVal {
    
    inline def setKind(value: Start): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
