package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerInstanceOption extends StObject {
  
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[listOfAvailabilityZone] = js.undefined
  
  /**
    * The broker's engine type.
    */
  var EngineType: js.UndefOr[typings.awsSdk.clientsMqMod.EngineType] = js.undefined
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.undefined
  
  /**
    * The list of supported deployment modes.
    */
  var SupportedDeploymentModes: js.UndefOr[listOfDeploymentMode] = js.undefined
  
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[listOfString] = js.undefined
}
object BrokerInstanceOption {
  
  inline def apply(): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstanceOption]
  }
  
  extension [Self <: BrokerInstanceOption](x: Self) {
    
    inline def setAvailabilityZones(value: listOfAvailabilityZone): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    inline def setStorageType(value: BrokerStorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSupportedDeploymentModes(value: listOfDeploymentMode): Self = StObject.set(x, "SupportedDeploymentModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedDeploymentModesUndefined: Self = StObject.set(x, "SupportedDeploymentModes", js.undefined)
    
    inline def setSupportedDeploymentModesVarargs(value: DeploymentMode*): Self = StObject.set(x, "SupportedDeploymentModes", js.Array(value*))
    
    inline def setSupportedEngineVersions(value: listOfString): Self = StObject.set(x, "SupportedEngineVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedEngineVersionsUndefined: Self = StObject.set(x, "SupportedEngineVersions", js.undefined)
    
    inline def setSupportedEngineVersionsVarargs(value: string*): Self = StObject.set(x, "SupportedEngineVersions", js.Array(value*))
  }
}
