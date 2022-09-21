package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.utilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInboundMessageBase
  extends StObject
     with JsonObject {
  
  /**
    * The kind of message this is.
    */
  val kind: JobInboundMessageKind
}
object JobInboundMessageBase {
  
  inline def apply(kind: JobInboundMessageKind): JobInboundMessageBase = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInboundMessageBase]
  }
  
  extension [Self <: JobInboundMessageBase](x: Self) {
    
    inline def setKind(value: JobInboundMessageKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
