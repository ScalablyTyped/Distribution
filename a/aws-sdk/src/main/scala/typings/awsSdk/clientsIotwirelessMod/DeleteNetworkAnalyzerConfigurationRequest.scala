package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkAnalyzerConfigurationRequest extends StObject {
  
  var ConfigurationName: NetworkAnalyzerConfigurationName
}
object DeleteNetworkAnalyzerConfigurationRequest {
  
  inline def apply(ConfigurationName: NetworkAnalyzerConfigurationName): DeleteNetworkAnalyzerConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationName = ConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkAnalyzerConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNetworkAnalyzerConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationName(value: NetworkAnalyzerConfigurationName): Self = StObject.set(x, "ConfigurationName", value.asInstanceOf[js.Any])
  }
}
