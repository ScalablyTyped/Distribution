package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.jobsApiMod.JobInboundMessageKind.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInboundMessageStop
  extends StObject
     with JobInboundMessageBase
     with JobInboundMessage[Any] {
  
  @JSName("kind")
  val kind_JobInboundMessageStop: Stop
}
object JobInboundMessageStop {
  
  inline def apply(kind: Stop): JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInboundMessageStop]
  }
  
  extension [Self <: JobInboundMessageStop](x: Self) {
    
    inline def setKind(value: Stop): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
