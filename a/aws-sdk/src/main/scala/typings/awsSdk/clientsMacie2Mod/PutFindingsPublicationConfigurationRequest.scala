package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFindingsPublicationConfigurationRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The configuration settings that determine which findings to publish to Security Hub.
    */
  var securityHubConfiguration: js.UndefOr[SecurityHubConfiguration] = js.undefined
}
object PutFindingsPublicationConfigurationRequest {
  
  inline def apply(): PutFindingsPublicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutFindingsPublicationConfigurationRequest]
  }
  
  extension [Self <: PutFindingsPublicationConfigurationRequest](x: Self) {
    
    inline def setClientToken(value: string): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setSecurityHubConfiguration(value: SecurityHubConfiguration): Self = StObject.set(x, "securityHubConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityHubConfigurationUndefined: Self = StObject.set(x, "securityHubConfiguration", js.undefined)
  }
}
