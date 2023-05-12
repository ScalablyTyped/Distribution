package typings.angularDevkitArchitect.srcJobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageBase extends StObject {
  
  /**
    * The job description.
    */
  val description: JobDescription
  
  /**
    * The kind of message this is.
    */
  val kind: JobOutboundMessageKind
}
object JobOutboundMessageBase {
  
  inline def apply(description: JobDescription, kind: JobOutboundMessageKind): JobOutboundMessageBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobOutboundMessageBase] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKind(value: JobOutboundMessageKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
