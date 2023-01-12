package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobInboundMessageBase] (val x: Self) extends AnyVal {
    
    inline def setKind(value: JobInboundMessageKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
