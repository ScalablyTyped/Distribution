package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlAuthentication extends StObject {
  
  /**
    * A structure containing details about how this workspace works with SAML. 
    */
  var configuration: js.UndefOr[SamlConfiguration] = js.undefined
  
  /**
    * Specifies whether the workspace's SAML configuration is complete.
    */
  var status: SamlConfigurationStatus
}
object SamlAuthentication {
  
  inline def apply(status: SamlConfigurationStatus): SamlAuthentication = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamlAuthentication] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: SamlConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setStatus(value: SamlConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
