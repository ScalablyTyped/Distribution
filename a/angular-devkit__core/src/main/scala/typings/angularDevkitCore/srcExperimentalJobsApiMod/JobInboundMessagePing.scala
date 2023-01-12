package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Ping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInboundMessagePing
  extends StObject
     with JobInboundMessageBase
     with JobInboundMessage[Any] {
  
  /**
    * An ID that should be returned in the corresponding Pong.
    */
  val id: Double
  
  @JSName("kind")
  val kind_JobInboundMessagePing: Ping
}
object JobInboundMessagePing {
  
  inline def apply(id: Double, kind: Ping): JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInboundMessagePing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobInboundMessagePing] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Ping): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
