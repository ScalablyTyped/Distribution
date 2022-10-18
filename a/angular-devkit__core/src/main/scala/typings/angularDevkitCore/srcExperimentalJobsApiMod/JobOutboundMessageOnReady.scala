package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.OnReady
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageOnReady
  extends StObject
     with JobOutboundMessageBase
     with JobOutboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobOutboundMessageOnReady: OnReady
}
object JobOutboundMessageOnReady {
  
  inline def apply(description: JobDescription, kind: OnReady): JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageOnReady]
  }
  
  extension [Self <: JobOutboundMessageOnReady](x: Self) {
    
    inline def setKind(value: OnReady): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
