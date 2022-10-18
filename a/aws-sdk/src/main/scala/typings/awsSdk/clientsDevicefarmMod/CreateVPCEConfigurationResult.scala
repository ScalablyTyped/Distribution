package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVPCEConfigurationResult extends StObject {
  
  /**
    * An object that contains information about your VPC endpoint configuration.
    */
  var vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
}
object CreateVPCEConfigurationResult {
  
  inline def apply(): CreateVPCEConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVPCEConfigurationResult]
  }
  
  extension [Self <: CreateVPCEConfigurationResult](x: Self) {
    
    inline def setVpceConfiguration(value: VPCEConfiguration): Self = StObject.set(x, "vpceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationUndefined: Self = StObject.set(x, "vpceConfiguration", js.undefined)
  }
}
