package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetVdmOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: typings.awsSdk.clientsSesv2Mod.ConfigurationSetName
  
  /**
    * The VDM options to apply to the configuration set.
    */
  var VdmOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.VdmOptions] = js.undefined
}
object PutConfigurationSetVdmOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetVdmOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetVdmOptionsRequest]
  }
  
  extension [Self <: PutConfigurationSetVdmOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setVdmOptions(value: VdmOptions): Self = StObject.set(x, "VdmOptions", value.asInstanceOf[js.Any])
    
    inline def setVdmOptionsUndefined: Self = StObject.set(x, "VdmOptions", js.undefined)
  }
}
