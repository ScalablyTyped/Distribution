package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * Defines the logging destinations for the logs for a firewall. Network Firewall generates logs for stateful rule groups. 
    */
  var LogDestinationConfigs: typings.awsSdk.clientsNetworkfirewallMod.LogDestinationConfigs
}
object LoggingConfiguration {
  
  inline def apply(LogDestinationConfigs: LogDestinationConfigs): LoggingConfiguration = {
    val __obj = js.Dynamic.literal(LogDestinationConfigs = LogDestinationConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  extension [Self <: LoggingConfiguration](x: Self) {
    
    inline def setLogDestinationConfigs(value: LogDestinationConfigs): Self = StObject.set(x, "LogDestinationConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationConfigsVarargs(value: LogDestinationConfig*): Self = StObject.set(x, "LogDestinationConfigs", js.Array(value*))
  }
}
