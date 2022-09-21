package typings.angularDevkitBuildWebpack.jobsApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutboundMessageChannelBase
  extends StObject
     with JobOutboundMessageBase {
  
  /**
    * The name of the channel.
    */
  val name: String
}
object JobOutboundMessageChannelBase {
  
  inline def apply(description: JobDescription, kind: JobOutboundMessageKind, name: String): JobOutboundMessageChannelBase = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutboundMessageChannelBase]
  }
  
  extension [Self <: JobOutboundMessageChannelBase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
