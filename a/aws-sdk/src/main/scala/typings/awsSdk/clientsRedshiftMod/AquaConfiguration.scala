package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AquaConfiguration extends StObject {
  
  /**
    * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
    */
  var AquaConfigurationStatus: js.UndefOr[typings.awsSdk.clientsRedshiftMod.AquaConfigurationStatus] = js.undefined
  
  /**
    * This field is retired. Amazon Redshift automatically determines whether to use AQUA (Advanced Query Accelerator).
    */
  var AquaStatus: js.UndefOr[typings.awsSdk.clientsRedshiftMod.AquaStatus] = js.undefined
}
object AquaConfiguration {
  
  inline def apply(): AquaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AquaConfiguration]
  }
  
  extension [Self <: AquaConfiguration](x: Self) {
    
    inline def setAquaConfigurationStatus(value: AquaConfigurationStatus): Self = StObject.set(x, "AquaConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setAquaConfigurationStatusUndefined: Self = StObject.set(x, "AquaConfigurationStatus", js.undefined)
    
    inline def setAquaStatus(value: AquaStatus): Self = StObject.set(x, "AquaStatus", value.asInstanceOf[js.Any])
    
    inline def setAquaStatusUndefined: Self = StObject.set(x, "AquaStatus", js.undefined)
  }
}
