package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfiguration extends StObject {
  
  /**
    * Network configuration settings for outbound message traffic.
    */
  var EgressConfiguration: js.UndefOr[typings.awsSdk.clientsApprunnerMod.EgressConfiguration] = js.undefined
}
object NetworkConfiguration {
  
  inline def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  
  extension [Self <: NetworkConfiguration](x: Self) {
    
    inline def setEgressConfiguration(value: EgressConfiguration): Self = StObject.set(x, "EgressConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEgressConfigurationUndefined: Self = StObject.set(x, "EgressConfiguration", js.undefined)
  }
}
