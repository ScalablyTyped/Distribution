package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatalakeAutoEnableRequest extends StObject {
  
  /**
    * Remove automatic enablement of configuration settings for new member accounts in Security Lake. 
    */
  var removeFromConfigurationForNewAccounts: AutoEnableNewRegionConfigurationList
}
object DeleteDatalakeAutoEnableRequest {
  
  inline def apply(removeFromConfigurationForNewAccounts: AutoEnableNewRegionConfigurationList): DeleteDatalakeAutoEnableRequest = {
    val __obj = js.Dynamic.literal(removeFromConfigurationForNewAccounts = removeFromConfigurationForNewAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatalakeAutoEnableRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDatalakeAutoEnableRequest] (val x: Self) extends AnyVal {
    
    inline def setRemoveFromConfigurationForNewAccounts(value: AutoEnableNewRegionConfigurationList): Self = StObject.set(x, "removeFromConfigurationForNewAccounts", value.asInstanceOf[js.Any])
    
    inline def setRemoveFromConfigurationForNewAccountsVarargs(value: AutoEnableNewRegionConfiguration*): Self = StObject.set(x, "removeFromConfigurationForNewAccounts", js.Array(value*))
  }
}
