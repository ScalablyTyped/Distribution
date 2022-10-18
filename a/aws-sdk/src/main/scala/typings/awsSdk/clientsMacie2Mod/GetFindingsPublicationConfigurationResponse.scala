package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsPublicationConfigurationResponse extends StObject {
  
  /**
    * The configuration settings that determine which findings are published to Security Hub.
    */
  var securityHubConfiguration: js.UndefOr[SecurityHubConfiguration] = js.undefined
}
object GetFindingsPublicationConfigurationResponse {
  
  inline def apply(): GetFindingsPublicationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsPublicationConfigurationResponse]
  }
  
  extension [Self <: GetFindingsPublicationConfigurationResponse](x: Self) {
    
    inline def setSecurityHubConfiguration(value: SecurityHubConfiguration): Self = StObject.set(x, "securityHubConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityHubConfigurationUndefined: Self = StObject.set(x, "securityHubConfiguration", js.undefined)
  }
}
