package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatalakeAutoEnableRequest extends StObject {
  
  /**
    * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts in your organization. 
    */
  var configurationForNewAccounts: AutoEnableNewRegionConfigurationList
}
object CreateDatalakeAutoEnableRequest {
  
  inline def apply(configurationForNewAccounts: AutoEnableNewRegionConfigurationList): CreateDatalakeAutoEnableRequest = {
    val __obj = js.Dynamic.literal(configurationForNewAccounts = configurationForNewAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatalakeAutoEnableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatalakeAutoEnableRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationForNewAccounts(value: AutoEnableNewRegionConfigurationList): Self = StObject.set(x, "configurationForNewAccounts", value.asInstanceOf[js.Any])
    
    inline def setConfigurationForNewAccountsVarargs(value: AutoEnableNewRegionConfiguration*): Self = StObject.set(x, "configurationForNewAccounts", js.Array(value*))
  }
}
