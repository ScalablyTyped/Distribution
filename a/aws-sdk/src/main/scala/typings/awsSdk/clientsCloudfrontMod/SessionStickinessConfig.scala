package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStickinessConfig extends StObject {
  
  /**
    * The amount of time after which you want sessions to cease if no requests are received. Allowed values are 300–3600 seconds (5–60 minutes). The value must be less than or equal to MaximumTTL.
    */
  var IdleTTL: integer
  
  /**
    * The maximum amount of time to consider requests from the viewer as being part of the same session. Allowed values are 300–3600 seconds (5–60 minutes). The value must be less than or equal to IdleTTL.
    */
  var MaximumTTL: integer
}
object SessionStickinessConfig {
  
  inline def apply(IdleTTL: integer, MaximumTTL: integer): SessionStickinessConfig = {
    val __obj = js.Dynamic.literal(IdleTTL = IdleTTL.asInstanceOf[js.Any], MaximumTTL = MaximumTTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionStickinessConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionStickinessConfig] (val x: Self) extends AnyVal {
    
    inline def setIdleTTL(value: integer): Self = StObject.set(x, "IdleTTL", value.asInstanceOf[js.Any])
    
    inline def setMaximumTTL(value: integer): Self = StObject.set(x, "MaximumTTL", value.asInstanceOf[js.Any])
  }
}
