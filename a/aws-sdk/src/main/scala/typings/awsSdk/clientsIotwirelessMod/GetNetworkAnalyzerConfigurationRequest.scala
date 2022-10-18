package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkAnalyzerConfigurationRequest extends StObject {
  
  var ConfigurationName: NetworkAnalyzerConfigurationName
}
object GetNetworkAnalyzerConfigurationRequest {
  
  inline def apply(ConfigurationName: NetworkAnalyzerConfigurationName): GetNetworkAnalyzerConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkAnalyzerConfigurationRequest]
  }
  
  extension [Self <: GetNetworkAnalyzerConfigurationRequest](x: Self) {
    
    inline def setConfigurationName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
  }
}
