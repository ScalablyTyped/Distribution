package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingConfig extends StObject {
  
  /**
    * The failover configuration for an endpoint. This includes what triggers failover and what happens when it's triggered.
    */
  var FailoverConfig: typings.awsSdk.clientsEventbridgeMod.FailoverConfig
}
object RoutingConfig {
  
  inline def apply(FailoverConfig: FailoverConfig): RoutingConfig = {
    val __obj = js.Dynamic.literal(FailoverConfig = FailoverConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutingConfig] (val x: Self) extends AnyVal {
    
    inline def setFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "FailoverConfig", value.asInstanceOf[js.Any])
  }
}
