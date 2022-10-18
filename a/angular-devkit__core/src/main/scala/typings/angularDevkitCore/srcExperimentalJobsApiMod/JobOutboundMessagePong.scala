package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Pong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessagePong
  extends StObject
     with JobOutboundMessageBase
     with JobOutboundMessage[Any] {
  
  /**
    * The ID that was passed in the `Ping` messages.
    */
  val id: Double
  
  @JSName("kind")
  val kind_JobOutboundMessagePong: Pong
}
object JobOutboundMessagePong {
  
  inline def apply(description: JobDescription, id: Double, kind: Pong): JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessagePong]
  }
  
  extension [Self <: JobOutboundMessagePong](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Pong): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
