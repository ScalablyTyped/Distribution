package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringNetworkConfig extends StObject {
  
  /**
    * Whether to encrypt all communications between the instances used for the monitoring jobs. Choose True to encrypt communications. Encryption provides greater security for distributed jobs, but the processing might take longer.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to allow inbound and outbound network calls to and from the containers used for the monitoring job.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object MonitoringNetworkConfig {
  
  inline def apply(): MonitoringNetworkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringNetworkConfig]
  }
  
  extension [Self <: MonitoringNetworkConfig](x: Self) {
    
    inline def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    inline def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
